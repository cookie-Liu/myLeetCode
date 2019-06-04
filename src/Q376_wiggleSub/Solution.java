package Q376_wiggleSub;

public class Solution {
	public static void main(String[] args) {
		//int[] nums = {1,17,5,10,13,15,10,5,16,8};
		//int[] nums = {1,7,4,9,2,5};
		int[] nums = {0,0};
		//int[] nums = {1,2,3,4,5,6,7,8,9};
		//int[] nums = {102,101,20,91,156,78,75,142,69,81,46,142,113,163,190,178,13,36,134,54};
		Solution solution = new Solution();
		int res = solution.wiggleMaxLength(nums);
		System.out.println(res);
	}

	public int wiggleMaxLength(int[] nums) {
		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return 1;
		int[] sub = new int[nums.length-1];	
		for(int i=0;i<nums.length-1;i++){
			sub[i] = nums[i+1] - nums[i];					
		}
		int count = 1;	
		int zero = 1;
		int i=0;
		while(i<sub.length-1){
			if(sub[i] * sub[i+1] < 0){
				count++;
				i++;
			}				
			else{
				if(sub[i] != 0){
					int j=i;
					for(j=i;j<=sub.length-1;j++){
						if(sub[i] * sub[j] < 0){
							count++;
							break;
						}					
					}
					i = j;
				}
				else{
					i++;
					zero++;
				}					
			}
		}
		if(count == 1 && zero == sub.length)
			return 1;
		return count+1;
	}
}
