package Q345_reverse;

public class test1 {
	
	public static void main(String[] args) {
		String s = "aA";
		String str = reverseVowels(s);
		System.out.println(str);
	}

	public static String reverseVowels(String s) {
		
		char[] array = s.toCharArray();
		int i = 0;
		int j =array.length-1;
		while(i<j){
			if(! isVowels(array[i]))
				i++;
			if(! isVowels(array[j]))
				j--;
			if(isVowels(array[i]) && isVowels(array[j])){
				swap(array, i, j);
				i++;
				j--;
			}				
		}
		return String.valueOf(array);
		
	}
	public static void swap(char[] array, int i, int j) {
		char tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		
	}

	public static boolean isVowels(char ch){
		if(ch == 'a' || ch  == 'e'|| ch  == 'i'|| ch  == 'o'|| ch  == 'u' || ch == 'A' || ch  == 'E'|| ch  == 'I'|| ch  == 'O'|| ch  == 'U')
			return true;
		else
			return false;
	}
//	public static boolean isVowels(char ch){
//		String v = "aeiouAEIOU";
//		if(v.contains(ch+""))
//			return true;
//		else
//			return false;
//	}
}
