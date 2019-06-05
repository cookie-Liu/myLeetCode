package Q1_sum;

import java.util.Arrays;
import java.util.HashMap;

/*by liu*/
public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {-18,12,3,0};
		int target = -6;
		int[] out = solution.twoSum(nums,target);
		for(int i:out)
			System.out.println(i);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] out = new int[2];
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			map.put(i,nums[i]);
		}
		Arrays.sort(nums);
		int i=0;int j=nums.length-1;
		while(i<j){
			if(nums[i] + nums[j] == target){
				out[0] = nums[i];
				out[1] = nums[j];
				break;
			}
			else if(nums[i] + nums[j] > target)
				j--;
			else
				i++;
		}
		for(int key:map.keySet()){
			if(map.get(key) == out[0]){
				out[0] = key;
				break;
			}
				
		} 
		for(int key:map.keySet()){
			if(key != out[0] && map.get(key) == out[1]){
				out[1] = key;
				break;
			}
				
		}      
		Arrays.sort(out);
		return out;

	}
}
