package Q300_longestIncreasingSub;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		//int[] nums = {10,9,2,5,3,7,101,18};
		int[] nums = {4,10,4,3,8,9};
		int res = solution.lengthOfLIS(nums);
		System.out.println(res);
	}

	public int lengthOfLIS(int[] nums) {
		if(nums.length == 0)
			return 0;
		int[] dp = new int[nums.length];
		for(int i=0;i<dp.length;i++){
			dp[i] = 1;
		}		
		for(int i=0;i<nums.length;i++){
			int m=1;
			for(int j=0;j<i;j++){
				if(nums[i] > nums[j])
					m = Math.max(m, dp[j]+1);
			}
			dp[i] = m;
		}
		
		int max = 0;
		for(int i:dp){
			if(i > max)
				max = i;
		}
		return max;
	}
}
