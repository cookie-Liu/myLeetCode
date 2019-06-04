package Q452_balloon;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
	public static void main(String[] args) {
		int[][] points = {{10,16},{2,8},{1,6},{7,12}};
		int num = findMinArrowShots(points);
		System.out.println(num);
	}

	public static int findMinArrowShots(int[][] points) {
		if(points.length <=0)
			return 0;
		int num=1;
//		Arrays.sort(points, new Comparator<Integer[]>(){
//		@Override
//		public int compare(Integer[] o1, Integer[] o2 ){
//			return o1[1]-o2[1];
//		}
//	});
		Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
		int end = points[0][1];
		for(int i=1;i<points.length;i++){
			int start = points[i][0];
			if(start > end){
				num++;
				end = points[i][1];
			}
		}
		return num;
	}
}
