package Q66_plusOne;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] digits = {9,9,9};
		int[] out = solution.plusOnue(digits);
		for(int o:out)
			System.out.println(o);
	}

	public int[] plusOnue(int[] digits) {
		int add = 0;
        for(int i=digits.length-1;i>=0;i--){
            if(i == digits.length-1)
                digits[i] = digits[i]+add+1;
            else 
                digits[i] = digits[i]+add;
            if(digits[i]>9){
                add = 1;
                digits[i] = 0;
            }
            else
                add = 0;
        }
        int[] newd = new int[digits.length+1];
        if(add == 1){            
            newd[0] = 1;
            for(int i=0;i<digits.length;i++){
                newd[i+1] = digits[i];
            }
        }
        if(add == 1)
            return newd;
        else
            return digits;  
	}
}
