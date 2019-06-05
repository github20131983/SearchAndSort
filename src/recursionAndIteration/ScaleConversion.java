package recursionAndIteration;

import java.util.Stack;

public class ScaleConversion {
	String base="0123456789abcdef";
	/*使用递归方法十进制数转b进制
	 * n:十进制数
	 * b:转b进制
	 * */
	public String baseString(int n,int b){
		if(n==0)
			return "";
		return baseString(n/b,b)+base.charAt(n%b);
	}
	
	/*使用非递归方法十进制数转b进制
	 * n:十进制数
	 * b:转b进制
	 * */
	public String baseString2(int n,int b){
		Stack<Character> s=new Stack<>();
		String res = "";
		while(n!=0){
			s.push(base.charAt(n%b));
			n=n/b;
		}
		while (!s.empty()) 
			res+=s.pop();
		return res;
	}
	public static void main(String[] args){
		ScaleConversion sc=new ScaleConversion();
		System.out.println(sc.baseString(95,8));
		System.out.println(sc.baseString2(95,8));
	}
}
