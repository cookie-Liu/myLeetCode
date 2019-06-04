package Q455_cookie;

import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		int[] kids = {1,2,3};
		int[] cookies = {3};
		int num = findContentChildren(kids, cookies);
		System.out.println(num);
	}
	public static int findContentChildren(int[] g, int[] s) {
		int child=0;
		int cookie=0;
		Arrays.sort(g);
		Arrays.sort(s);
				
/*		//自己写的 很麻烦
		int num=0;
		int j=0;	
		for(int i=0;i<g.length;i++){
			while(j<s.length){
				if(g[i] <= s[j]){
					num++;
					j++;
					break;
				}					
				else
					j++;
			}		
		}*/
		
		//参考
		while(child<g.length && cookie<s.length){
			if(g[child] <= s[cookie])
				child++;
			cookie++;
		}
		return child;
	}
}
