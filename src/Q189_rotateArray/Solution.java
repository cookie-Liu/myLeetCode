package Q189_rotateArray;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		solution.rotate(nums, k);
		for(int i:nums)
			System.out.println(i);
	}
//	public void rotate(int[] nums, int k) {
//		for(int i=0;i<k;i++){
//			int tmp = nums[nums.length-1];
//			for(int j=nums.length-2;j>=0;j--){				
//				nums[j+1] = nums[j];				
//			}
//			nums[0] = tmp;
//		}
//	}
	public void rotate(int[] nums, int k) {
		if(k > nums.length)
			k = k % nums.length;
		int[] array = new int[k];
		for(int i=0;i<k;i++){
			array[i] = nums[nums.length-k+i];
		}
		for(int i = nums.length-k-1;i>=0;i--){
			nums[i+k] = nums[i];
		}
		for(int i=0;i<k;i++)
			nums[i] = array[i];
	}
}
