package Q213_rob;

public class test1 {
	public static void main(String[] args) {
		int nums[] = {1,2,1,1};
		int money = rob(nums);
		System.out.println(money);
	}

	public static int rob(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		int n = nums.length;
		return Math.max(rob(nums, 0, n-2), rob(nums, 1, n-1));
	}
	
//	public static int rob(int[] nums, int first, int last) {
//		int pre = 0; int prepre = 0;
//		for(int i=first;i<=last;i++){
//			int curr = Math.max(prepre+nums[i], pre);
//			prepre = pre;
//			pre = curr;
//		}
//		return pre;
//	}
	
	public static int rob(int[] nums, int first, int last) {
		int[] dp = new int[nums.length];
		if(first == 0)
			dp[0] = nums[0];
		else
			dp[1] = nums[1];
		for(int i=first+1;i<=last;i++){
			int tmp1=0;int tmp2=0;
			if(i>=2)
				tmp1 = dp[i-2] + nums[i];
			if(i >=1)
				tmp2 = dp[i-1];
			dp[i] = Math.max(tmp1,tmp2);
		}
		return dp[last];
	}

}
