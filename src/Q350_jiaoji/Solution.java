package Q350_jiaoji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] out = solution.intersect(nums1, nums2);
		for(int i:out)
			System.out.println(i);
	}

	/*方法一，自己写*/
//	public int[] intersect(int[] nums1, int[] nums2) {
//		List<Integer> list = new ArrayList<Integer>();
//		Arrays.sort(nums1);
//		Arrays.sort(nums2);
//		for(int i=0;i<nums1.length;i++){
//			for(int j=0;j<nums2.length;j++){
//				if(nums1[i] == nums2[j] && !list.contains(j)){
//					list.add(j);
//					break;
//				}
//					
//			}
//		}
//		int[] out = new int[list.size()];
//		for(int i=0;i<list.size();i++){
//			out[i] = nums2[list.get(i)];
//		}
//		return out;
//	}
	
	/*方法二，排序后优化*/
//	public int[] intersect(int[] nums1, int[] nums2) {
//		List<Integer> list = new ArrayList<Integer>();
//		Arrays.sort(nums1);
//		Arrays.sort(nums2);
//		int i=0;int j=0;
//		while(i<nums1.length && j<nums2.length){
//			if(nums1[i] == nums2[j]){
//				list.add(nums1[i]);
//				i++;
//				j++;
//			}			
//			else if(nums1[i] < nums2[j])
//				i++;
//			else
//				j++;
//		}
//		int[] out = new int[list.size()];
//		for(i=0;i<list.size();i++){
//			out[i] = list.get(i);
//		}
//		return out;
//	}
	
	/*方法三，用map*/
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums1.length;i++){
			if(map.containsKey(nums1[i]))
				map.put(nums1[i], map.get(nums1[i])+1);
			else
				map.put(nums1[i], 1);
		}
		for(int i=0;i<nums2.length;i++){
			if(map.containsKey(nums2[i]) && map.get(nums2[i]) != 0){
				list.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i])-1);			
			}
		}
		int[] out = new int[list.size()];
		for(int i=0;i<list.size();i++){
			out[i] = list.get(i);
		}
		return out;
	}
}
