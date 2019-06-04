package Q739_DailtTemperatures;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] out = solution.dailyTemperatures(T);
		for(int o:out)
			System.out.print(o+",");
	}

	public int[] dailyTemperatures(int[] T) {
		int[] out = new int[T.length]; 
		for(int i=0;i<T.length;i++){
			int j=0;
			for(j=i+1;j<T.length;j++){
				if(T[j] > T[i]){
					out[i] = j-i;
					break;
				}
			}
			if(j == T.length-1 && T[j] <= T[i])
				out[i] = 0;
		}
		return out;
	}
}
