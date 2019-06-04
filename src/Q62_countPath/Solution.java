package Q62_countPath;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int m=3;
		int n=2;
		int count = solution.uniquePaths(m,n);
		System.out.println(count);
	}

	public int uniquePaths(int m, int n) {
		if(m == 0 && n==0)
			return 0;
		int[][] path = new int[m][n];
		path[0][0] = 1;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i>0 && j >0)
					path[i][j] = path[i-1][j] + path[i][j-1];
				if(i == 0 && j>0)
					path[i][j] = 1;
				if(j == 0 && i>0)
					path[i][j] = 1;
			}
		}	
		return path[m-1][n-1];
	}
}
