package Q435_notOverlapping;

import java.util.Arrays;
import java.util.Comparator;

public class test1 {
	public static void main(String[] args) {
		Interval[] array = new Interval[4];
		array[0] = new Interval(1,100);
		array[1] = new Interval(11,22);
		array[2] = new Interval(1,11);
		array[3] = new Interval(2,12);
		int num = eraseOverlapIntervals(array);
		System.out.println(num);
	}

	public static int eraseOverlapIntervals(Interval[] intervals) {
		if(intervals.length <= 0)
			return 0;
		int num=0;
		//按照数组的结尾数字进行排序
		Arrays.sort(intervals, new Comparator<Interval>() {
		    @Override
		    public int compare(Interval o1, Interval o2) {	    	
		        return o1.end - o2.end;
		    }
		});
		
		int end = intervals[0].end;
		for(int i=1;i<intervals.length;i++){
			int start = intervals[i].start;
			if(start < end){
				num++;
			}else{
				end = intervals[i].end;	
			}
			
		}
		return num;
	}
}
