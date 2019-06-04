package Q60_Kth;

public class test1 {
	public static void main(String[] args) {
		int n=3;
		int k=3;
		String s = getPermutation(n,k);
		System.out.println(s);
	}

	public static String getPermutation(int n, int k) {
		int jc = 1;
        for(int i=1;i<=n-1;i++)
            jc *= i;
        int small = 1;
        int big = jc;
        int first = 1;
        String s = "";
        while(first <= n){
        	if(k >= small && k <= big){
                s = s + first;
                int index = k-small;
                int i=0;
                int tmp=1;
                while( i <= index){
                	if(tmp != first){
                		i++;
                	}
            		tmp ++;
                }
            }else{
                small += jc;
                big += jc;
                first ++;
            }
        }     
        return s;
	}
}
