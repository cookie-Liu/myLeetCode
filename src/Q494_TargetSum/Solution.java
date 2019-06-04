package Q494_TargetSum;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {2,107,109,113,127,131,137,3,2,3,5,7,11,13,17,19,23,29,47,53};
		int s = 2147483647;
		Solution solution = new Solution();
		int count = solution.findTargetSumWays(nums,s);
		System.out.println(count);
	}

	public int findTargetSumWays(int[] nums, int S) {
		if(nums.length == 0)
			return 0;
		int sum=0;
		for(int n:nums)
			sum += n; 
		if(sum < S)
			return 0;
		int[][] dp = new int[nums.length][2*sum+1];	
		dp[0][nums[0]+sum] = 1;
		dp[0][-nums[0]+sum] = 1;
		for(int i=1;i<nums.length;i++){
			for(int j=0;j<=2*sum;j++){
				if(dp[i-1][j] > 0){
					dp[i][j+nums[i]] += dp[i-1][j];
					dp[i][j-nums[i]] += dp[i-1][j];
				}	
			}
		}
		return dp[nums.length-1][S+sum];
	}
}
