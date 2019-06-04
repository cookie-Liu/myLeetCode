package Q122_stock;

public class test1 {
	public static void main(String[] args) {
		int[] prices = {6,1,3,2,4,7}; 
		int result = maxProfit(prices);
		System.out.println(result);
	}
	public static int maxProfit(int[] prices) {
		if(prices.length <= 0)
			return 0;
		int money = 0;
		int max = 0;
		int min=prices[0];
		int idxMin=0;
		int i=0;
		while(i<prices.length){
			int start = prices[i];
			if(prices[i] < min){
				min = prices[i];
				idxMin = i;
			} 
			int j=i;
			while(j<prices.length){
				int end = prices[j];
				if(end - start >0){
					money += end-start;
					//i=j;
					//if(j+1 < prices.length )
						start = prices[j];
					j=j+1;
				}else{
					j++;
				}
			}
			i++;
			if(money > max)
				max = money;
			money = 0;
		}
		//        for(i=idxMin;i<prices.length;i++){
		//            if(prices[i] > max)
		//                max = prices[i];
		//        }
		//        int sub = max - min;
		//        int result = Math.max(sub, money);
		return max;
	}
}
