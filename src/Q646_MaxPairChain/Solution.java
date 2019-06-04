package Q646_MaxPairChain;

import java.util.Arrays;
import java.util.Comparator;

import Q435_notOverlapping.Interval;

public class Solution {
	public static void main(String[] args) {
		//int[][] pair = {{1,2},{2,3},{3,4}};
		//int[][] pair = {{2,3},{1,2},{3,4}};
		int[][] pair = {{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};
		Solution solution = new Solution();
		int count = solution.findLongestChain(pair);
		System.out.println(count);
	}

	public int findLongestChain(int[][] pairs) {
		//Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));		
		Arrays.sort(pairs, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });	
		int count = 1;
		int last = pairs[0][1];
		for(int i=1;i<pairs.length;i++){
			if(last < pairs[i][0]){
				count++;
				last = pairs[i][1];
			}				
		}
		return count;
	}
}
