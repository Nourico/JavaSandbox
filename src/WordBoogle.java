
public class WordBoogle {

	public static boolean lookup(String dic, char[][] bog) {
		char[][] b = new char[bog.length][];
		for (int i = 0; i < bog.length; i++)
			b[i] = bog[i].clone();
		
		int icurr = 0;
		int jcurr = 0;
		int count = 0;
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				if (dic.charAt(0) == b[i][j]) {
					icurr = i;
					jcurr = j;
					b[i][j] = '0';
					count++;
				}
			}
		}
		
		for (int i = 1; i < dic.length(); i++) {
			
			for (int j = icurr - 1; j <= icurr + 1; j++) {
				for (int k = jcurr - 1; k <= jcurr + 1; k++) {
					if (j >= 0 && k >= 0 && j < b.length && k < b.length) {
						if (dic.charAt(i) == b[j][k]) {
							icurr = j;
							jcurr = k;
							b[j][k] = '0';
							count++;
						}
					}
				}
			}
			
		}
		if (count == dic.length())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		String[] dictionary = {"GEEKS", "FOR", "QUIZ", "GO"};
		char[][] boggle = {{'G','I', 'Z'},
						   {'U', 'E', 'K'},
						   {'Q', 'S', 'E'}};
		
		for (int i = 0; i < dictionary.length - 1; i++)
			if (lookup(dictionary[i], boggle))
				System.out.print(dictionary[i] + " ");

	}

}
