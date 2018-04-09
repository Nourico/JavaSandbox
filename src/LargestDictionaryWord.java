
public class LargestDictionaryWord {

	boolean isSubSequence(String s1, String s2) {
		int m = s1.length(), n = s2.length();
		int j = 0;
		for (int i = 0; i < n && j < m; i++) {
			if (s2.charAt(i) == s1.charAt(j))
				j++;
		}
		return (j == m);
	}
	
	String findLongestString(String[] dictionary, String str) {
		
		String result = "";
		int length = 0;
		
		for (String word : dictionary) {
			if(length < word.length() && isSubSequence(word, str)) {
				result = word;
				length = word.length();
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		LargestDictionaryWord ldw = new LargestDictionaryWord();
		String[] dict = {"ale", "apple", "monkey", "plea"};
	    String str = "abpcplea" ;
		System.out.println(ldw.findLongestString(dict, str));
	}

}
