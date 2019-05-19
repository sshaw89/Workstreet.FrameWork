package arrays;
import java.util.Scanner;
public class MainClass3 {
	static Scanner scan = new Scanner(System.in);
	// array in descending order..
	public static void main(String[] args) {
		
		        System.out.println("Enter size of array");
				int size = scan.nextInt();
				int[] arr = new int[size];
				enterElements(arr);
				sort(arr);
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
				System.out.println("Now array in desc order");
				for(int i = 0 ;i<=arr.length-1;i++) 
				{
					System.out.println(arr[i]);
				}
			
			}
			//we have to write our own sort method......
			public static void sort(int[] arr)
			{
				for(int i = 0; i<=arr.length-1; i++) //to run 5 times
				{
					for(int j = i+1; j<=arr.length-1; j++)// just remember the variable names.....
					{
						if(arr[i]<arr[j])
						{
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
					
				}
			}

 }

