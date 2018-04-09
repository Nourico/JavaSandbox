//Given a string, eliminate all “b” and “ac” in the string, you have to replace them in-place, and you are only allowed to iterate over the string once. 
public class BACStringRemoval {

	static void stringFilter(char[] str) {
		int state = 1;
		
		int j = 0;
		for (int i = 0; str[i] != '\0'; i++) {
			if (state == 1 && str[i] != 'a' && str[i] != 'b') {
				str[j] = str[i];
				j++;
			}
			
			if (state == 2 && str[i] != 'c') {
				str[j] ='a';
				j++;
				
				if (str[i] != 'a' && str[i] != 'b') {
					str[j] = str[i];
					j++;
				}
			}
			
			state = (str[i] == 'a') ? 2:1;
		}
		
		if (state == 2) {
			str[j] = 'a';
			j++;
		}
		
		str[j] = '\0';
	}
	
	public static void main(String[] args) {
		char str[] = {'a','b','a','b','a','a','c', '\0'};
		stringFilter(str);
		System.out.println(str);

	}

}
