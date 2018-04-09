
public class MatrixFloodFill {

	void floodFillUtil(char[][] mat, int x, int y, char prevV, char newV) {
		if (x < 0 || x >= mat[0].length || y < 0 || y >= mat.length)
			return;
		if (mat[x][y] != prevV)
			return;
		
		mat[x][y] = newV;
		
		floodFillUtil(mat, x+1, y, prevV, newV);
		floodFillUtil(mat, x-1, y, prevV, newV);
		floodFillUtil(mat, x, y+1, prevV, newV);
		floodFillUtil(mat, x, y-1, prevV, newV);
	}
	
	void replaceSurrounded(char[][] mat) {
		for (int i = 0; i < mat[0].length; i++)
			for (int j = 0; j < mat.length; j++)
				if (mat[i][j] == 'O')
					mat[i][j] = '-';
		
		for (int i = 0; i < mat[0].length; i++)
			if (mat[i][0] == '-')
				floodFillUtil(mat, i, 0, '-', 'O');
		for (int i = 0; i < mat[0].length; i++)
			if (mat[i][mat.length -1] == '-')
				floodFillUtil(mat, i, mat.length -1, '-', 'O');
		for (int i = 0; i < mat.length; i++)
			if (mat[0][i] == '-')
				floodFillUtil(mat, 0, i, '-', 'O');
		for (int i = 0; i < mat.length; i++)
			if (mat[mat[0].length-1][i] == '-')
				floodFillUtil(mat, mat[0].length-1, i, '-', 'O');
		
		for (int i=0; i<mat[0].length; i++)
		      for (int j=0; j<mat.length; j++)
		         if (mat[i][j] == '-')
		             mat[i][j] = 'X';
	}
	
	public static void main(String[] args) {
		char mat[][] = {{'X', 'O', 'X', 'O', 'X', 'X'},
						{'X', 'O', 'X', 'X', 'O', 'X'},
						{'X', 'X', 'X', 'O', 'X', 'X'},
						{'O', 'X', 'X', 'X', 'X', 'X'},
						{'X', 'X', 'X', 'O', 'X', 'O'},
						{'O', 'O', 'X', 'O', 'O', 'O'}
						};
		
		MatrixFloodFill mff = new MatrixFloodFill();
		mff.replaceSurrounded(mat);
		
		for (int i=0; i<mat[0].length; i++)
	    {
	      for (int j=0; j<mat.length; j++)
	          System.out.print(mat[i][j] + " "); 
	      System.out.println();
	    }
		

	}

}
