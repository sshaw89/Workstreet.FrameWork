package oopsConcept;

public class CleartripPrac1 {

	public static void main(String[] args) {
		swapTwoNum(10, 20);
		noDivisibleBy3(10, 15);
		System.out.println(sumOfNum(123)) ;
		System.out.println(reverseAnNum(123));
		palindrome(123);
		palindrome(121);
		System.out.println(factorial(5));
		//double d = (double)30;
		//int i = (int)3.3;
		
	}
	public static void swapTwoNum(int a , int b)
	{
		int temp;
		temp = a;
		a = b;
		b= temp;
		System.out.println("a is "+a +" b is "+b);
		
	}
	public static void noDivisibleBy3(int a, int b) {
		for(int i=a;i<=b;i++) {
			if(i%3==0)
				System.out.println(i);
		}
		
	}
	public static int sumOfNum(int num) {
		int sum = 0;
		while(num>0) {
		sum = num%10+sum;
		num = num/10;
		}
		
		return sum;
		
	}
	public static int reverseAnNum(int num) {
		int rev = 0;
		while(num>0) {
			rev = (rev*10)+num%10;
			num = num/10;
		}
		return rev;
		
	}
	public static void palindrome(int num) {
		 int rev = 0,originalNum;
			originalNum = num;

	    //reversed integer is stored in variable 
	        while( num>0 )
	        {
	            rev= rev * 10 +num % 10;
	            num  /= 10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalNum == rev)
	            System.out.println(originalNum + " is a palindrome.");
	        else
	            System.out.println(originalNum + " is not a palindrome.");
	    }
	
	public static int factorial(int num) {
		int res = num;
		for(int i=1;i<num;i++){
			res= res*i;
			
		}
		return res;}
	
	
}



