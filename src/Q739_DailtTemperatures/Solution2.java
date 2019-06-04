package Q739_DailtTemperatures;

import java.util.Stack;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] T = {89,62,70,58,47,47,46,76,100,70};
		int[] out = solution2.dailyTemperatures(T);
		for(int o:out)
			System.out.print(o+",");
	}

	public int[] dailyTemperatures(int[] T) {
		Stack<Integer> stack = new Stack<>();
		int[] out = new int[T.length];
		for(int i=0;i<T.length;i++){
			while(!stack.isEmpty() && T[stack.peek()] < T[i]){
				int idx = stack.pop();
				int val = i - idx;
				out[idx] = val;
			}
			stack.push(i);			
		}
		return out;
	}
}
