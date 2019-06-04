package Q279_perfectSquares;

public class Solution2 {
	public static void main(String[] args) {
		int n = 13;
		Solution2 solution = new Solution2(); 
		int num = solution.numSquares(n);
		System.out.println(num);
	}

	public int numSquares(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i=2;i<=n;i++){
			int sqrt = (int)Math.sqrt(i);
			if(sqrt * sqrt == i){
				dp[i] = 1;
				continue;
			}
			int min = n;
			for(int j=1;j<=sqrt;j++){
				int tmp = dp[i-j*j]+1;
				if(tmp < min)
					min = tmp;
			}
			dp[i] = min;
		}
		return dp[n];
	}
}
