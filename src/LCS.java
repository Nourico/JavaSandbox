//
//public class LCS {
//
//	/* Return length of LCS for X[0..m-1], Y[0..n-1] */
//	static void lcs(String X, String Y, int m, int n) {
//		
//		// Dynamic Programming
//		int L[][] = new int[m+1][n+1];
//		
//		// Following steps build L[m+1][n+1] in bottom up fashion. Note that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
//		for (int i = 0; i <= m; i++)
//			for (int j = 0; j <= n; j++) {
//				if (i == 0 || j == 0)
//					L[i][j] = 0;
//				else if (X[i-1] == Y[j-1])
//					L[i][j] = L[i-1][j-1] + 1;
//				else
//					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
//				
//			}
//
//		// Following code is used to print LCS
//		int index = L[m][n];
//		int temp = index;
//		
//		// Create a character array to store the lcs string
//		char[] lcs = new char[index+1];
//		lcs[index] = '\0';
//		
//		// Start from the right-most-bottom-most corner and one by one store characters in lcs
//		int i = m, j = n;
//		while (i > 0 && j > 0) {
//			// If current character in X[] and Y are same, then current character is part of LCS
//			if (X.charAt(i-1) == Y.charAt(j-1)) {
//				lcs[index-1] = X.charAt(i-1);
//				i--;
//				j--;
//				index--;
//			}
//			
//			// If not same, find 
//		}
//		
//		
//		
//		
//		
//		// Naive solution
////		if (m == 0 || n == 0)
////			return 0;	
////		if (X[m-1] == Y[n-1]) 
////			return 1 + lcs(X, Y, m-1, n-1);
////		else 
////			return max(lcs(X, Y, m-1, n), lcs(X, Y, m, n-1));
//	}
//	
//	/* Utility function to get max of two integers */
//	int max(int a, int b) {
//		return (a > b) ? a : b;
//	}
//	
//	
//	public static void main(String[] args) {
//		LCS lcs = new LCS();
//		String s1 = "AGGTAB";
//		String s2 = "GXTXAYB";
//		
//		char[] X = s1.toCharArray();
//		char[] Y = s2.toCharArray();
//		int m = X.length;
//		int n = Y.length;
//		
//		System.out.println("Length of LCS is " + lcs.lcs(X, Y, m, n));
//
//	}
//
//}
