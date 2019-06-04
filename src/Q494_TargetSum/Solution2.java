package Q494_TargetSum;

public class Solution2 {
	static int count;
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1};
		int s = 3;
		Solution2 solution2 = new Solution2();
		solution2.findTargetSumWays(nums,s);
		System.out.println(count);
	}

	public int findTargetSumWays(int[] nums, int S) {
		count = 0;
		dfs(0, S, nums, 0);
		return count;
	}

	public void dfs(int val, int s, int[] nums, int i) {
		if(i == nums.length){
			if(val == s)
				count++;
			return;
		}			
		dfs(val + nums[i], s, nums, i+1);
		dfs(val - nums[i], s, nums, i+1);
	}

}
