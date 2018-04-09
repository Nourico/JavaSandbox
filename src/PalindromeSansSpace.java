
public class PalindromeSansSpace {

	static boolean isPallindrome(char[] str){
		int i = 0; 
		int j = str.length - 1;
		while (i < str.length/2 + 1) {
			
			if (str[i] == ' ')
				i++;
			if (str[j] == ' ')
				j--;
			if (i == j)
				return true;
			if (str[i] != str[j])
				return false;
			
			i++;
			j--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		char[] str = {'r','a','c', ' ', 'e','c','a','r'};
		System.out.println(isPallindrome(str));

	}

}
