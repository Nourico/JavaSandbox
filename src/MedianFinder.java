import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;
	
	public MedianFinder() {
		maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		minHeap = new PriorityQueue<Integer>();
	}
	
	public void addNum(int num) {
		double median = 0;
		if (maxHeap.size() == 0 && minHeap.size() == 0) {
			median = (double)num;
		}
		else {
			if (num <= median) {
				if (maxHeap.size() <= minHeap.size()) {
					maxHeap.offer(num);
				} else {
					minHeap.offer(maxHeap.poll());
					maxHeap.offer(num);
				}
			} else {
				if (minHeap.size() <= maxHeap.size()) {
					minHeap.offer(num);
				} else {
					maxHeap.offer(minHeap.poll());
					minHeap.offer(num);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
