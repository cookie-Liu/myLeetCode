package Q136_apearOnce;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] nums = {1,2,1,2,4};
		int out = solution2.singleNumber(nums);
		System.out.println(out);
	}

	public int singleNumber(int[] nums) {
		int res = nums[0];
		for(int i=1;i<nums.length;i++){
			res = res ^ nums[i];
		}
		return res;
	}
}
