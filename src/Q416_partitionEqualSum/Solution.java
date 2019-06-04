package Q416_partitionEqualSum;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,2,3,4};
		boolean flag = solution.canPartition(nums);
		System.out.println(flag);
	}

	public boolean canPartition(int[] nums) {
		int flag=0;
		int sum = 0;
		for(int i:nums)
			sum += i;
		if(sum % 2 != 0)
			return false;
		int target = sum/2;
		Arrays.sort(nums);
		if(nums[nums.length-1] > target){
			return false;
		}
		
		int tmpSum = 0;
		int i=nums.length-1;
			int tmp = nums[i];
			if(tmp == target){
				return true;
			}else if(tmp < target){
				int left = target - tmp;
				for(int n=0;n<i;n++){
					if(nums[n] == left)
						return true;
				}
				int p = 0; int q = i-1;
				while(p<q){
					if(nums[p] + nums[q] == left){
//						flag=1;
//						break;
						return true;
					}
					else if(nums[p] + nums[q] < left){
						p++;
					}
					else if(nums[p] + nums[q] > left){
						q--;
					}
				}
			}
		return false;
	}
}
