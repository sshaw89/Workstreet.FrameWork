package string_class;

public class MainClass1 {
   //remove  multiple spaces between the string. 
	public static void main(String[] args) {
		String s = "my    name    is    avinesh";//we have to give same no. of spaces in that...
		System.out.println(s);
		String s1 = s.replaceAll("    "," ");
		System.out.println(s1);
		System.out.println(s.replaceAll("    ", " "));
		

	}

}
