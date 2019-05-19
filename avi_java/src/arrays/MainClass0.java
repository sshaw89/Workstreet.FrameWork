package arrays;
//Advance For loop   for(array type   refrence var : array name(arr)

public class MainClass0 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//to print the values...
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("==============");
		
		for(int j = arr.length-1;j>=0;j--)//to print it in reverse order
		{
			System.out.println(arr[j]);
		}
		System.out.println("-------------------------");
		
		for(int k = 0;k<=arr.length-1; k+=2)//to print odd elements of array
		{
			System.out.println(arr[k]);
		}
		/* to be easy we use advance for loop 
		 * it is faster...
		 */
		System.out.println("=================");
		for(int l : arr)
		{
			System.out.println(l);
		}

	}

}
