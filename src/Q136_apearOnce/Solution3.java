package Q136_apearOnce;

import java.util.HashMap;

public class Solution3 {
	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		int[] nums = {4,1,2,1,2};
		int out = solution3.singleNumber(nums);
		System.out.println(out);
	}

	public int singleNumber(int[] nums) {
		int res = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(! map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		}
		for(int key:map.keySet()){
			if(map.get(key) == 1){
				res = key;
				break;
			}
		}
		return res;
	}
}
