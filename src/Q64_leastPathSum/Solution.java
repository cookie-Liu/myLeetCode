package Q64_leastPathSum;

public class Solution {
	public static void main(String[] args) {
		//int[][] path = {{1,3,1},{1,5,1},{4,2,1}};
		int[][] path = {{1,2},{5,6},{1,1}};
		Solution s = new Solution();
		int minSum = s.minPathSum(path);
		System.out.println(minSum);
	}
	
	
	

	public int minPathSum(int[][] grid) {
		if(grid.length == 0 && grid[0].length == 0)
			return 0;
		int[][] pathSum = new int[grid.length][grid[0].length];
		pathSum[0][0] = grid[0][0];
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(i ==0 && j==0)
					continue;
				if(i==0 && j>0)
					pathSum[i][j] = pathSum[i][j-1]+grid[i][j];
				else if(j==0 && i>0)
					pathSum[i][j] = pathSum[i-1][j]+grid[i][j];
				else 
					pathSum[i][j] = Math.min(pathSum[i][j-1]+grid[i][j], pathSum[i-1][j]+grid[i][j]);
			}
		}
		return pathSum[grid.length-1][grid[0].length-1];
	}
}
