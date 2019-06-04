package Q343_integerBreak;

public class Solution {
	public static void main(String[] args) {
		int n = 3;
		Solution solution = new Solution();
		int max = solution.integerBreak(n);
		System.out.println(max);
	}

	public int integerBreak(int n) {
		int max = 0;
		int mul = 0;
		int mul_max=0;
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2; 
		for(int i=2;i<=n;i++){
			for(int j=1;j<=i-1;j++){
				mul = dp[j] * dp[i-j];
				if(mul > mul_max)
					mul_max = mul;
			}
			if( mul_max > i)
				dp[i] = mul_max;
			else
				dp[i] = i;
		}
		if( n == dp[n])
			return mul_max;
		return dp[n];
	}
}
