package Q198_rob;

public class test1 {
	public static void main(String[] args) {
		int nums[] = {1,2,1,1};
		int money = rob(nums);
		System.out.println(money);
	}
	public static int rob(int[] nums) {
		 if(nums.length == 0)
	            return 0;
	        if(nums.length == 1)
	        	return nums[0];
	        if(nums.length == 2)
	        	return Math.max(nums[1], nums[0]);
	        int[] dp = new int[nums.length];
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[1], nums[0]);

	        int max=0;
	        int flag=1;
	        for(int i=2;i<nums.length;i++){
	            int tmp1=0;
	            if(i>=2)
	                tmp1 = dp[i-2] + nums[i];
	            dp[i] = Math.max(tmp1,dp[i-1]);

	        }
	        if(flag == 1){
	           max = dp[dp.length-2];
	        }else{
	           max = dp[dp.length-1]; 
	        }     
	        return max;
	}
	
//	int[] money = new int[nums.length];
//  int max=0;
//  for(int i=0;i<nums.length;i++){
//      money[i] = nums[i];
//  }
//  for(int i=nums.length-1;i>=0;i--){
//      for(int j=i+1;j<i+3;j++){
//          if(j<nums.length)
//              money[i] = nums[i] + nums[j];
//     }
//  }
//  for(int i=0;i<money.length;i++){
//      if(money[i] > max)
//          max = money[i];
//  }
//  return max;
}
