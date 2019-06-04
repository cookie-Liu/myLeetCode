package Q26_deleteReputation;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int count = solution.removeDuplicates(nums);
		for(int i=0;i<count;i++){
			System.out.println(nums[i]);
		}

	}

	public int removeDuplicates(int[] nums) {
		if(nums.length == 0)
			return 0;
		int count = 1;
		int i = 0;
		int idx = 1;
		while(i<nums.length-1){
			int j=i+1;
			while(nums[j] == nums[i] && j<nums.length-1){
				j++;
			}
			if(nums[j] != nums[i]){
				nums[idx] = nums[j];
				count++;
				idx++;
			}
			i = j;
		}
		return count;
	}
}
