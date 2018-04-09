
public class WordBoggleTrie {

	static final int SIZE = 26;
	static final int M = 3;
	static final int N = 3;
	
	static class TrieNode{
		TrieNode[] Child = new TrieNode[SIZE];
		
		boolean leaf;
		
		public TrieNode() {
			leaf = false;
			for (int i = 0; i < SIZE; i++)
				Child[i] = null;
		}
	}
	
	static void insert(TrieNode root, String Key) {
		int n = Key.length();
		TrieNode pChild = root;
		
		for (int i = 0; i < n; i++) {
			int index = Key.charAt(i) - 'A';
			if (pChild.Child[index] == null)
				pChild.Child[index] = new TrieNode();
			
			pChild = pChild.Child[index];
		}
		
		pChild.leaf = true;
	}
	
	static boolean isSafe(int i, int j, boolean visited[][]) {
		return (i >=0 && i < M && j >=0 && j < N && !visited[i][j]);
	}
	
	static void searchWord(TrieNode root, char boggle[][], int i, int j, boolean visited[][], String str) {
		
	}
	
	static void findWords(char boggle[][], TrieNode root) {
		
	}
	
	public static void main(String[] args) {
		String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GEE"};
		TrieNode root = new TrieNode();
		
		int n = dictionary.length;
		for (int i = 0; i < n; i++)
			insert(root, dictionary[i]);
		
		char boggle[][] = {{'G', 'I', 'Z'}, {'U', 'E', 'K'}, {'Q', 'S', 'E'}};
		
		findWords(boggle, root);

	}

}
