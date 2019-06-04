package Q378_kthSmallest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
		int k = 8;
		int res = solution.kthSmallest(matrix, k);
		System.out.println(res);
	}

	public int kthSmallest(int[][] matrix, int k) {
		Queue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2){
				return o2-o1;
			}
		});
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i*matrix.length + j < k)
				    maxHeap.offer(matrix[i][j]);
			    else{
                    if(matrix[i][j] < maxHeap.peek()){
                        maxHeap.poll();
                        maxHeap.offer(matrix[i][j]);
                    }
			    }
            }
        }
        int topK = maxHeap.poll();
		return topK;
	}
}
