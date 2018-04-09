//import java.awt.List;
//import java.util.ArrayList;
//
//public class BucketSort {
//
//	private static final int DEFAULT_BUCKET_SIZE = 5;
//	
//	public static void sort(Integer[] array) {
//		sort(array, DEFAULT_BUCKET_SIZE);
//	}
//	
//	public static void sort(Integer[] array, int bucketSize) {
//		if (array.length == 0)
//			return;
//		
//		Integer minValue = array[0];
//		Integer maxValue = array[0];
//		
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] < minValue)
//				minValue = array[i];
//			else if (array[i] > maxValue)
//				maxValue = array[i];
//		}
//		
//		int bucketCount = (maxValue - minValue) / bucketSize + 1;
//		List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
//		for (int i = 0; i < bucketCount; i++) {
//			buckets.add(new ArrayList<Integer>());
//		}
//		
//		for (int i = 0; i < array.length; i++)
//			buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
//		
//		int currentIndex = 0;
//		for (int i = 0; i < buckets.size(); i++) {
//			Integer[] bucketArray = new Integer[buckets.get(i).size()];
//			bucketArray = buckets.get(i).toArray(bucketArray);
//			InsertionSort.sort(bucketArray);
//			for(int j = 0; j < bucketArray.length; j++)
//				array[currentIndex++] = bucketArray[j];
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
