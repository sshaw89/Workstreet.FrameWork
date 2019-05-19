package arrays;

public class MainClass_1 {

	public static void main(String[] args) {
		 int[] arr = new int[5];
		    arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
			arr[1] = arr[1]+arr[2];
			
			System.out.println(arr.length);//will get the size of the array..
			System.out.println(arr[0]);//first element of array
			System.out.println(arr[arr.length-1]);//will get the last element of array.
			System.out.println("last element of array is "+arr[4]);
			System.out.println(arr[1]); //addition

	}

}
