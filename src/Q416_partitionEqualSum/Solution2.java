package Q416_partitionEqualSum;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] nums = {1,5,5,2};
		boolean flag = solution2.canPartition(nums);
		System.out.println(flag);
	}

	public boolean canPartition(int[] nums) {
		int sum = 0;
		for(int i:nums)
			sum += i;
		if(sum % 2 != 0)
			return false;
		int target = sum/2;
		int tmpSum = 0;
		boolean flag = canPartition(nums, 0, 0, target);
		return flag;
	}

	public boolean canPartition(int[] nums, int index, int tmpSum, int target) {
		if(index == nums.length - 1){
			if(tmpSum == target)
				return true;
			else
				return false;
		}
		boolean flag1 = canPartition(nums, index+1, tmpSum + nums[index], target);
		boolean flag2 = canPartition(nums, index+1, tmpSum, target);
		return flag1 || flag2;
	}
}
