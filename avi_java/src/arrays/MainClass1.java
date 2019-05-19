package arrays;

import java.util.Scanner;
//the array program.
public class MainClass1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		enterElements(arr);
		print(arr);
		}
	public static void enterElements(int[] arr)
	{
		System.out.println("enter elements ");
		for(int i = 0 ; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();		
	    }
	}
	
	public static void print(int[] arr)
	{
		for(int i = 0 ;i<=arr.length-1;i++) 
		{
			System.out.println(arr[i]);
		}
		scan.close();  //close the scanner class..
	}

}
