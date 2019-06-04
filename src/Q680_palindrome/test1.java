package Q680_palindrome;

public class test1 {
	public static void main(String[] args) {
		String s = "cdbeeeabddddbaeedebdc";
		//String s = "ebcbbececabbacecbbcbe";
		//String s ="ngzodrdohhqilovouwqrbpgqvlplsnfzueemmjtqnizodigfzeuuezfgidozinqtjmmeeuzfnslpvqgpbrqwuovoliqhhodirdozgn";
		test1 t = new test1();
		boolean flag = t.validPalindrome(s);
		System.out.println(flag);
	}

	public boolean validPalindrome(String s) {
		char[] array = s.toCharArray();
		int i=0;int j=array.length-1;
		int count=0;
		while(i<j){
			if(count > 1)
				return false;
			if(array[i] == array[j]){
				i++;
				j--;
			}else{
				count++;
//				if(array[i] == array[j-1] && array[i+1] != array[j]){
//					j--;
//					continue;
//				}				
//				if(array[i+1] == array[j] && array[i] != array[j-1]){
//					i++;
//					continue;
//				}					
				if(array[i] == array[j-1] || array[i+1] == array[j]){
					String str1 = s.substring(i+1, j+1);
					String str2 = s.substring(i, j);
					boolean flag1 = validPalindromeSubString(str1) ;
					if(flag1 == true)
						return true;
					boolean flag2 = validPalindromeSubString(str2) ;
					return flag1 || flag2;
				}				
			}
		}
		return true;
	}
	public boolean validPalindromeSubString(String s){
		char[] array = s.toCharArray();
		int i=0;int j=array.length-1;
		while(i<j){
			if(array[i] == array[j]){
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}	
}
