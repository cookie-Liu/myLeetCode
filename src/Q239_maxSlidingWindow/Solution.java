package Q239_maxSlidingWindow;

import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		//int[] nums = {1,3,-1,-3,5,3,6,7};
		int[] nums = {-7,-8,7,5,7,1,6,0};
		int k = 4;
		int[] out = solution.maxSlidingWindow(nums, k);
		for(int num: out)
			System.out.println(num);
		
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums.length == 0)
			return nums;
		int[] out = new int[nums.length-k+1];
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<nums.length;i++){
			if(list.size() == 0 || nums[i] < nums[list.getLast()])
				list.add(i);
			else{
				while(list.size() > 0 && nums[list.getLast()] < nums[i]){
					list.remove(list.getLast());					
				}
				list.add(i);
			}
			if(i - list.get(0) >= k)
				list.remove(0);
			if(i-k+1 >= 0)
				out[i-k+1] = nums[list.get(0)];
		}
		return out;
	}
}
