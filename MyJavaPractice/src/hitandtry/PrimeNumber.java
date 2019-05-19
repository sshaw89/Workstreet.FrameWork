package hitandtry;

public class PrimeNumber {

	public static void main(String[] args) {
	    primenum(4);

	}
	public static void primenum(int num) {
		boolean flag = true;
		for(int i=2; i<=num/2;i++) {
			if(num%i==0){
				flag = false;
			}
		}
		if(flag==false)
			System.out.println("number is not prime");
		else
			System.out.println("number is prime");
	}			 
}


