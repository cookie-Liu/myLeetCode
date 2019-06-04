package Q91_decode;

public class Solution {
	public static void main(String[] args) {
		String s = "01";
		Solution solution = new Solution();
		int num = solution.numDecodings(s);
		System.out.println(num);
	}

//	public int numDecodings(String s) {
//		char[] array = s.toCharArray();
//		if(array.length == 0)
//			return 0;
//		int[] dp = new int[array.length+1];
//		dp[array.length] = 0;
//		for(int i=array.length-1;i>=0;i--){
//			if(array[i] == '0'){
//				dp[i] = 0;
//				continue;
//			}			
//			String str = "";
//			if(i+1 < array.length)
//				 str = str + array[i] + array[i+1] ;
//			else
//				str +=  array[i];
//			int tmp = Integer.parseInt(str);
//			if(tmp <= 26 && tmp >=1){
//				 if(i+2 <array.length)
//					 dp[i] = dp[i+1] + dp[i+2];
//				 else
//					 dp[i] = dp[i+1] + 1; 
//			}
//				
//			else
//				dp[i] = dp[i+1];
//		}
//		return dp[0];
//	}
	
	public int numDecodings(String s) {
		char[] array = s.toCharArray();
		if(array.length == 0)
			return 0;
		int[] dp = new int[array.length+1];
		for(int i=array.length-1;i>=0;i--){
			if(array[i] == '0'){
				dp[i] = 0;
				continue;
			}			
			int convert = 0;
			int digit2=0;
			int digit1 = array[i] - '0';
			if(i+1 < array.length){
				digit2 = array[i+1] - '0';
				convert=digit1*10 + digit2;
			}				
			else
				convert = digit1;
			if(convert <= 26 && convert >=1){
				 if(i+2 <array.length)
					 dp[i] = dp[i+1] + dp[i+2];
				 else
					 dp[i] = dp[i+1] + 1; 
			}				
			else
				dp[i] = dp[i+1];
		}
		return dp[0];
	}
}
