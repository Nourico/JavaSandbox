

public class RearrangeString {

	static final int MAX_CHAR = 26;
	
	static String arrangeString(String str) {
		int char_count[] = new int[MAX_CHAR];
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				char_count[str.charAt(i) - 'A']++;
			else
				sum = sum + (str.charAt(i)-'0');
		}
		
		String res = "";
		
		for (int i = 0; i < MAX_CHAR; i++) {
			char ch = (char)('A'+i);
			while (char_count[i]-- != 0)
				res = res + ch;
		}
		
		if (sum > 0)
			res = res + sum;
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		String str = "ACCBA10D2EW30";
        System.out.println(arrangeString(str));
	}

}
