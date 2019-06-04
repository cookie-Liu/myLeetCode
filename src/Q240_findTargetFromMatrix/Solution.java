package Q240_findTargetFromMatrix;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] matrix = {{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		int target = 20;
		boolean flag = solution.searchMatrix(matrix,target);
		System.out.println(flag);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0)
			return false;
		int i = 0;
		int j = matrix[0].length-1;
		while(i<matrix.length && j>=0){
			if(matrix[i][j] > target){
				j--;
			}
			else if(matrix[i][j] < target){
				i++;
			}
			else if(matrix[i][j] == target)
				return true;
		}
		return false;
	}
}
