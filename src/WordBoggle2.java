import java.util.Arrays;

public class WordBoggle2 {

	String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GO"};
	int n = dictionary.length;
	
	Boolean isWord(String str) {
		for (int i = 0; i < n; i++)
			if (str.equals(dictionary[i]))
				return true;
		return false;
	}
	
	private void findWordsUtil(char boggle[][], Boolean visited[][], int i, int j, String str) {
		int M = boggle.length;
		int N = boggle[0].length;
		visited[i][j] = true;
		str = str + boggle[i][j];
		if (isWord(str))
			System.out.println(str);
		
		for (int row = i-1; row <= i+1 && row < M; row++)
			for (int col = j-1; col <= j+1 && col < N; col++) 
				if (row >= 0 && col >= 0 && !visited[row][col])
					findWordsUtil(boggle, visited, row, col, str);
		
		str = str.substring(0, str.length()-1);
		visited[i][j] = false;
	}
	
	public void findWords(char boggle[][]) {
		int M = boggle.length;
		int N = boggle[0].length;
		Boolean visited[][] = new Boolean[M][N];
		Arrays.fill(visited, false);
		
		String str = "";
		for(int i= 0; i < M; i++)
			for (int j = 0; j < N; j++)
				findWordsUtil(boggle, visited, i, j, str);
		
	}
	
	
	public static void main(String[] args) {
		char boggle[][] = { {'G', 'I', 'Z'},
							{'U', 'E', 'K'},
							{'Q', 'S', 'E'}};
		
		WordBoggle2 wb = new WordBoggle2();
		wb.findWords(boggle);

	}

}
