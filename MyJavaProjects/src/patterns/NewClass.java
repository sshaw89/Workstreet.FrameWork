package patterns;

import java.util.Stack;

public class NewClass {

	public static void main(String[] args) {
		String str="subrat shaw";
		str=rev(str);
		System.out.println(str);
	}
	public static String rev(String str) {
		
		if(str==null||str=="") {
			return str;
		}
		Stack<Character> stack=new Stack<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			stack.push(ch[i]);
		}
		int k=0;
		while (!stack.isEmpty()) {
			ch[k++]=stack.pop();
		}
		return String.copyValueOf(ch);
		
	}

}
