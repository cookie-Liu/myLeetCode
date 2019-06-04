package Q215_topK;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k=2;
		int res = solution.findKthLargest(nums,k);
		System.out.println(res);
	}

	public int findKthLargest(int[] nums, int k) {
		if(nums.length == 0)
			return 0;
		Integer[] arr = new Integer[nums.length];
		for(int i=0;i<nums.length;i++){
			arr[i] = nums[i];
		}		
		Arrays.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2-o1;
            }
        });
        int topK = arr[k-1];
        return topK;
	}
}
