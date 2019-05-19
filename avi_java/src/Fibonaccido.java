import java.util.Scanner;

public class Fibonaccido {

	public static void main(String[] args) 
	{
		int c = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scan.nextInt();
		scan.close();//always remember to close the scanner class.
		int b = a;
		System.out.println("so the series is like this ");
		System.out.println(a);
		System.out.println(b);
		do {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}while(c<=100);
		
	

	}

}
