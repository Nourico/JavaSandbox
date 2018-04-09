
public class EggDropping {

	static int max(int a, int b) { return (a > b)? a:b;}
	
	static int eggDrop(int n, int k) {
		if (k == 1 || k == 0)
			return k;
		
		if (n == 1)
			return k;
		
		int min = Integer.MAX_VALUE, x, res;
		
		for (x =1; x <= k; x++) {
			res = max(eggDrop(n-1, x-1), eggDrop(n, k -1));
			if (res < min)
				min = res;
		}
		
		return min + 1;
		
		
	}
	
	static int eggDrop2(int n, int k) {
		int eggFloor[][] = new int[n+1][k+1];
		int res;
		int i,j,x;
		
		for(i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}
		
		for (j=1; j<=k; j++)
			eggFloor[1][j] = j;
		
		for(i=2; i<= n;i++) {
			for (j=2; j<=k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for(x=1; x<=j; x++) {
					res = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
					if (res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}
		
		return eggFloor[n][k];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
