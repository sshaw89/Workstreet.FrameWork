package arrays;

import java.util.Scanner;

public class MainClass4 {
	static Scanner scan = new Scanner(System.in);
	    public static void main(String[] args) {
		//char array count of characters
		System.out.println("enter size of array");
		int size = scan.nextInt();
		char[] arr = new char[size];
		addElements(arr);
		sort(arr);

	}
	public static void addElements(char[] arr) 
	{
		System.out.println("enter the values for array");
		for(int i = 0; i<=arr.length-1; i++)
		{
			arr[i] = scan.next(".").charAt(0);
		}
			
	}
	
	public static void print(char[] arr)
	{
		System.out.println("print the elements of array");
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	//now to short the array accordingly
	public static void sort(char[] arr)
	{
		int upper = 0;
		int lower = 0;
		int Special = 0;
		for(int i = 0; i<=arr.length-1; i++)
		{
		if(arr[i] >=65 && arr[i]<=90)
		{
			upper++;
			
		}
		else if(arr[i]>=97 && arr[i]<=122)
		{
			
		    lower++;
			
		}
		else
		{
			Special++;
		}
		}
		System.out.println("The count of characters is follows");
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(Special);
	}

}
