package Q136_apearOnce;

import java.util.Arrays;
/*by liu*/
public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {4,1,2,1,2};
		int out = solution.singleNumber(nums);
		System.out.println(out);
	}

	public int singleNumber(int[] nums) {
		int out = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                out = nums[i];
                break;
            }    
            i += 2;
        }
        if(out ==  Integer.MIN_VALUE)
        	out = nums[nums.length-1];
        return out;
	}
}
