package arrays;

public class MainClass_2 {

	public static void main(String[] args) {
		// declaration of array three type 
		int[] arr;
		double []arr1;
		char arr2[];
		//instantiation of array size of array how many elements it can holds; initially all having default values.
		arr = new int[5]; //default value 0
		arr1 = new double[5];   //default value 0.0
		arr2 = new char[5];   //default value space.
		//utilization of array gives default values.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//now initialization of array and values of array are fetched on the basis of index value
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;		
		
		System.out.println("---------------------");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		System.out.println("========================1");
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		//initializing double array
		arr1[0] = 10.9;
		arr1[1] = 20.9;
		arr1[2] = 30.9;
		arr1[3] = 40.9;
		arr1[4] = 50.9;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println("==========================2");
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		//initializing char array
		arr2[0] = 'a';
		arr2[1] = 'A';
		arr2[2] =  49;  //if gives ascii value give it without single quotes.
		arr2[3] = ' ';
		arr2[4] = '%';
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);


	}

}
