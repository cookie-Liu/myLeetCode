package Q503_nextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] nums ={1,2,1};
		int[] out = solution2.nextGreaterElements(nums);
		for(int o:out)
			System.out.println(o);
	}

	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int[] out = new int[nums.length];
		Arrays.fill(out, -1);
		for(int i=0;i<2*nums.length;i++){
			int ii = i % nums.length;
			while(!stack.isEmpty() && nums[stack.peek()] < nums[ii]){
				int index = stack.pop();
				out[index] = nums[ii];
			}
			if(i < nums.length)
				stack.push(i);			
		}
		return out;
	}

//	public int[] nextGreaterElements(int[] nums) {
//		Stack<Integer> stack = new Stack<>();
//		int[] out = new int[nums.length];
//		Arrays.fill(out, -1);
//		for(int i=0;i<2*nums.length;i++){
//			int idx = 0;
//			idx = i % nums.length;
//			while(!stack.isEmpty() && stack.peek() < nums[idx]){
//				int val = stack.pop();
//				out[idx-1] = nums[idx];
//			}	
//			if(i< nums.length)
//				stack.push(nums[idx]);
//		}
//		return out;
//	}
}
