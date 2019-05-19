package oopsConcept;

import java.util.Scanner;

public class OopsTestProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter nos");
		System.out.println(product(scan.nextInt(), scan.nextInt()));
		scan.close();
		

	}
	public static int product(int n,int m) {
		int res = n*m;
		return res;
		}

}
