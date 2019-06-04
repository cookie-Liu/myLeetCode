package Q20_Patentheses;

import java.util.Stack;

public class test1 {
	public static void main(String[] args) {
		//String s = "()[]{}";
		String s = "([)]";
		boolean flag = isValid(s);
		System.out.println(flag);
	}

	public static boolean isValid(String s) {
		if(s.length() == 0)
			return true;
		boolean flag=true;
		Stack<Character> stack = new Stack<>();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
				stack.push(arr[i]);
			else{
				if(stack.isEmpty())
					return false;
				char ch = stack.pop();
				if(arr[i] == ')'){
					if(ch != '(')
						return false;
				}
				if(arr[i] == '}'){
					if(ch != '{')
						return false;
				}
				if(arr[i] == ']'){
					if(ch != '[')
						return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
