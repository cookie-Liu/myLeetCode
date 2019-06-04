package Q413_arithmeticSlices;

public class Solution {
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		Solution solution = new Solution();
		int num = solution.numberOfArithmeticSlices(array);
	}

	public int numberOfArithmeticSlices(int[] A) {
		int[] dp = new int[A.length];
		int sum=0;
		for(int i=2;i<A.length;i++){
			if(A[i] - A[i-1] == A[i-1] - A[i-2]){
				dp[i] = dp[i-1] + 1;
				sum += dp[i];
			}
		}
		return sum;
	}
}
