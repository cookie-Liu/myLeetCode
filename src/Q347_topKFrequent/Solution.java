package Q347_topKFrequent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums={4,1,-1,2,-1,2,3,2};
		int k = 2;
		List<Integer> list = solution.topKFrequent(nums, k);
		for(int l:list)
			System.out.println(l);
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		List<Integer> listc = new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		}
		Iterator it = map.keySet().iterator();  
		int idx=0;
        while (it.hasNext()) {  
            int count = map.get(it.next());  
            listc.add(count);
            idx++;
        }  
        Collections.sort(listc, new Comparator<Integer>(){
        	@Override
        	public int compare(Integer o1, Integer o2){
        		return o2-o1;
        	}
        });
        for(int i=0; i<k;i++){
        	for(int key:map.keySet()){
        		if(listc.get(i) == map.get(key) && !list.contains(key)){
        			list.add(key);
        		}
        	}
        }
		return list;
	}
}
