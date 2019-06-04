package Q283_moveZero;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {0,1,0,3,12};
		solution.moveZeroes(nums);
		for(int i:nums)
			System.out.println(i);
	}

	public void moveZeroes(int[] nums) {
		int idx = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] != 0){
				nums[idx] = nums[i];
				idx++;
			}
		}
		for(int i=idx;i<nums.length;i++)
			nums[i] = 0;
		
	}
	
	/*×Ô¼ºÐ´*/
//	 public void moveZeroes(int[] nums) {
//	        for(int i=0;i<nums.length;i++){
//	            if(nums[i] == 0){
//	                for(int j = i+1;j<nums.length;j++){
//	                    if(nums[j] != 0){
//	                        swap(nums, i, j);
//	                        break;
//	                    }
//	                        
//	                }
//	            }
//	        }
//	    }
//	    public void swap(int[] nums, int i, int j){
//	        int tmp = nums[i];
//	        nums[i] = nums[j];
//	        nums[j] = tmp;
//	    }
}
