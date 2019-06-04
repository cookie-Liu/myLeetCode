package Q279_perfectSquares;

public class Solution {
	int[] save;
	public static void main(String[] args) {
		int n = 12;
		Solution solution = new Solution(); 
		int num = solution.numSquares(n);
		System.out.println(num);
	}

	public int numSquares(int n) {
		if(n == 1)
			return 1;
		else if(n==0)
			return 0;
		
		this.save=new int[n+1];
		this.save[1]=1;
		return deal(n);
		
	}
	public int deal(int n) {
	
		if(n == 1)
			return 1;
		else if(n==0)
			return 0;
		
		if(this.save[n]!=0)
			return this.save[n];
		
		int limit = (int)Math.sqrt(n);
		int min=Integer.MAX_VALUE;
		for(int i=limit;i>0;i--){
			int leftn = n-i*i;
			int temp = deal(leftn)+1;
			if(temp<min)
				min=temp;
		}
		this.save[n]=min;
		return min;
	}


	
}
