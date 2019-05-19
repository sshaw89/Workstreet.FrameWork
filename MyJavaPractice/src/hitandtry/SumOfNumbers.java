package hitandtry;

public class SumOfNumbers {
/*
 * bhai recursion is the most important thing in java so be careful.
 */
	public static void main(String[] args) {
		System.out.println(sumOfnNumbers(5));

	}
	static int sumOfnNumbers(int i) {
		if(i==0) {
			return 0;
		}else {
			return i+sumOfnNumbers(i-1);	
			
		}
		
	}

}
