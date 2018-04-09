import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ElectionVotes {


	
	public static String count(String[] peops) {
		HashMap<String, Integer> votes = new HashMap<>();
		int n = peops.length;
		for (int i = 0; i < n; i++) {
			Integer id = votes.get(peops[i]);
			if (id != null) {
				votes.put(peops[i], id + 1);
			} else {
				votes.put(peops[i], 1);
			}
		}
		
		int maxVote = 0;
		Stack<String> names = new Stack<String>();
		
		for (Map.Entry<String, Integer> entry: votes.entrySet()) {
			if (entry.getValue() == maxVote) {
				names.push(entry.getKey());
			}
			if (entry.getValue() > maxVote) {
				while (!names.isEmpty())
					names.pop();
				names.push(entry.getKey());	
				maxVote = entry.getValue();
			}
		}
		
		String elected = null;
		if (!names.isEmpty())
			elected = names.pop();
		while (!names.isEmpty()) {
			if (names.peek().compareTo(elected) < 0)
				elected = names.pop();
			else
				names.pop();
		}
			
		
		return elected;
	}
	
	
	public static void main(String[] args) {
		String[] peoples = {"john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
		System.out.println(count(peoples));
		
		
	}

}
