package arrays;

import java.util.Arrays;
import java.util.Scanner;
//practice of the array program..and short it by inbuilt sort method ascending
public class MainClass2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		addelements(arr);
		Arrays.sort(arr);
		print(arr);
	 }
	 static void addelements(int[] arr)
	 {
		 System.out.println("enter elements");
		 for(int i = 0; i<=arr.length-1; i++)
		 {
			arr[i] = sc.nextInt(); 
		 }
	 }
	  static void print(int[] arr)
	  {
		  System.out.println("printing the elements");
		  for(int i = 0; i<=arr.length-1; i++)
		  {
			  System.out.println(arr[i]);
		  }
		  sc.close();
	  }
      
}
