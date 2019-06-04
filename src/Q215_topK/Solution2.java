package Q215_topK;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] nums = {3,2,1,5,6,4};
		int k=2;
		int res = solution2.findKthLargest(nums,k);
		System.out.println(res);
	}

	public int findKthLargest(int[] nums, int k) {
//		Queue<Integer> min_heap = new PriorityQueue<>(4, new Comparator<Integer>(){
//			@Override
//			public int compare(Integer o1, Integer o2){
//				return o2-o1;
//			}
//		});
		Queue<Integer> minHeap = new PriorityQueue<>(k);
		for(int i=0;i<nums.length;i++){
			if(i<k)
				minHeap.offer(nums[i]);
			else{
				if(nums[i] > minHeap.peek()){
					minHeap.poll();
					minHeap.offer(nums[i]);
				}
			}
		}
		int topK = minHeap.poll();
		return topK;
		
	}
}
