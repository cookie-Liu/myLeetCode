package Q347_topKFrequent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		int[] nums={4,1,-1,2,-1,2,3,2};
		int k = 2;
		List<Integer> list = solution2.topKFrequent(nums, k);
		for(int l:list)
			System.out.println(l);
	}

	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(k,new Comparator<Integer>()
		{
			public int compare(Integer a, Integer b)
			{
				return map.get(a) - map.get(b);
			}
		});
		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				map.put(nums[i], map.get(nums[i]) + 1);
		}
		for(int key: map.keySet()){
			if(pq.size() < k)
				pq.offer(key);
			else{
				if(map.get(key) > map.get(pq.peek())){
					pq.poll();
					pq.offer(key);
				}
			}
		}  
		while(!pq.isEmpty()){
			list.add(pq.poll());
		}
		return list;
	}
	//	public List<Integer> topKFrequent(int[] nums, int k) {
	//		HashMap<Integer, Integer> map = new HashMap<>();
	//        for (int num : nums)
	//        {
	//            map.put(num, map.getOrDefault(num, 0) + 1);
	//        }
	//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>()
	//        {
	//            public int compare(Integer a, Integer b)
	//            {
	//                return map.get(a) - map.get(b);
	//            }
	//        });
	//        for (int key : map.keySet())
	//        {
	//            if (pq.size() < k)
	//                pq.add(key);
	//            else if (map.get(key) > map.get(pq.peek()))
	//            {
	//                pq.remove();
	//                pq.add(key);
	//            }
	//        }
	//        List<Integer> res = new ArrayList<>();
	//        while (!pq.isEmpty())
	//        {
	//            res.add(pq.remove());
	//        }
	//        return res;
	//	}
}
