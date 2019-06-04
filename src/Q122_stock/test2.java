package Q122_stock;

public class test2 {
	public static void main(String[] args) {
		int[] prices = {6,1,3,2,4,7}; 
		int result = maxProfit(prices);
		System.out.println(result);
	}

//	public static int maxProfit(int[] prices) {
//		int money =0;
//		int max=0;
//		for(int i=0;i<prices.length;i++){
//			for(int j=0;j<prices.length-1;j++){
//				if(prices[j+1] > prices[j])
//					money += prices[j+1] - prices[j];
//			}
//			if(money > max)
//				max = money;
//			money = 0;
//		}
//		return max;
//	}
	
	public static int maxProfit(int[] prices) {
        int money =0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i+1] > prices[i])
				money += prices[i+1] - prices[i];
		}
		return money;
    }
}
