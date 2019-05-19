package hitandtry;

public class AddTheDigits {

	public static void main(String[] args) {
	    sumOfDigits(123);
	    sumOfDigitsWhile(5474);
	    System.out.println(sumOfDigitsRecursion(1234));
	    
	}
	
	//method 1
	public static void sumOfDigits( int num){
			int sum = 0;
			// using for loop
			for(int j = num; j>0;) {
				sum = sum+(j%10);
				j = j/10;
			}
			System.out.println(sum);
		}
	//method 2 -by using while loop
	public static void sumOfDigitsWhile(int num) {
		    int sum1 = 0;
			while(num>0)
			{
				sum1 = sum1+(num%10);
				num = num/10;
				
			}
			System.out.println(sum1);    
	     }
    //method 3 - by using recursion :::no need to initialize the "sum" variable here.
	public static int sumOfDigitsRecursion( int num){
			if(num==0) {
				return 0;
			}else {
				return (num%10)+sumOfDigitsRecursion(num/10);   //while ant method return something it should be catch by Sout.
			}
		}
}