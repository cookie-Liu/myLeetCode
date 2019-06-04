package Q503_nextGreaterElement;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums ={-1,0};
		int[] out = solution.nextGreaterElements(nums);
		for(int o:out)
			System.out.println(o);
		
	}

	public int[] nextGreaterElements(int[] nums) {
		int[] out = new int[nums.length];
		for(int i=0;i<nums.length;i++)
			out[i] = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				if(nums[j] > nums[i]){
					out[i] = nums[j];
					break;
				}
			}
			if(out[i] == Integer.MIN_VALUE){
				for(int j=0;j<i;j++){
					if(nums[j] > nums[i]){
						out[i] = nums[j];
						break;
					}
				}
			}
			if(out[i] == Integer.MIN_VALUE)
				out[i] = -1;			
		}
		return out;
	}


}
