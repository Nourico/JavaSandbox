import java.util.Arrays;

public class WordBreak {

	static boolean dictionaryContains(String word) {
		String dictionary[] = {"mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i", "like", "ice", "cream"};
		int size = dictionary.length;
		for (int i = 0; i < size; i++)
			if (dictionary[i].equals(word))
				return true;
		return false;
	}
	
	static boolean wordBreak(String str) {
		int size = str.length();
		if (size == 0) return true;
		Boolean[] wb = new Boolean[size+1];
		Arrays.fill(wb, false);
		
		for (int i = 1; i <= size; i++) {
			// if wb[i] is false, then check if current prefix can make it true. 
			// Current prefix is "str.substr(0, i)"
			if (wb[i] == false && dictionaryContains(str.substring(0, i)))
				wb[i] = true;
			
			if (wb[i] == true) {
				// If we reached the last prefix
				if (i == size)
					return true;
				
				for (int j = i+1; j <= size; j++) {
					// Update wb[j] if it is false and can be updated
					// Note the parameter passed to dictionaryContains() is 
					// substring starting from index 'i' and length 'j-i'
					if (wb[j] == false && dictionaryContains(str.substring(i,j-i)))
						wb[j] = true;
					
					if (j == size && wb[j] == true)
						return true;
					
				}
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(wordBreak("ilikesamsun"));
		

	}

}
