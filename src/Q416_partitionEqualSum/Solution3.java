package Q416_partitionEqualSum;

public class Solution3 {
	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		int[] nums = {1, 2, 3, 5};
		boolean flag = solution3.canPartition(nums);
		System.out.println(flag);
	}

	public boolean canPartition(int[] nums) {
		if(nums.length == 0)
			return false;
		int sum = 0;
		for(int i:nums)
			sum += i;
		if(sum % 2 != 0)
			return false;
		int target = sum/2;
		boolean[][] dp = new boolean[nums.length][target+1];
		
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<=target;j++){
				if(i == 0){
					if(i==j)
						dp[i][j] = true;
					continue;
				}
				if(j == 0){
					dp[i][j] = true;
					continue;
				}					
 				if(j >= nums[i])
					dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		return dp[nums.length-1][target];
	}
}
