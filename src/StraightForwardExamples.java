
public class StraightForwardExamples {
	
//	Given two strings, the task is to check whether these strings are meta strings or not. Meta strings are the strings which can be made equal by exactly one swap in any of the strings. 
	public static boolean areMetaStrings(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		
		if (len1 != len2)
			return false;
		
		int prev = -1, curr = -1;
		
		int count = 0;
		for (int i = 0; i < len1; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				count++;
				if (count > 2)
					return false;
				prev = curr;
				curr = i;
			}
		}
		
		return (count == 2 && str1.charAt(prev) == str2.charAt(curr) && str1.charAt(curr) == str2.charAt(prev));
	}
}
