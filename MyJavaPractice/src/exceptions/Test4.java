package exceptions;

public class Test4 {

	public static void main(String[] args) {
		/**
		 * throw keyword
		 * when ever we want to create an exception explicitly or custom or customize a exception according to
		 * out requirement.
		 * we use it inside the methods
		 * apan throw karwa rehe the exception
		 * it used only to throw unchecked/runtime exception
		 */
		m1(10);
	}
	public static void m1(int num) {
		//we can use it when purposely we want to throw exception
			if(num>10) {
			System.out.println("num is greater then 10");
		}else if(num<10) {
				System.out.println("num is less then 10");
			}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		
		
	}

}
