package string_class;

import java.util.Scanner;
//given string is palindrome or not 
public class MainClass2 {
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter string value");
		String s = scan.nextLine();
		String rev = "";
        char[] ch = s.toCharArray();
        for(int i = ch.length-1; i>=0; i--)
        {
        	 rev = ch[i]+rev;
        }
        if(s.equals(rev))
        {
        	System.out.println("yes it is palindrome");
        }
        else 
        {
        	System.out.println("no its not palindrome");
        }
		
		scan.close();

	}

}
