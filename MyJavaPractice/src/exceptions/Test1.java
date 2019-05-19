package exceptions;

public class Test1 {

	public static void main(String[] args) {
		//Arithmetic
		try {
		int i = 10/0;
		System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println("handlesd");
			e.printStackTrace();
			System.out.println(e.toString()); //acche trike se exception ka naam aata he
			System.out.println(e.getMessage());//sirf wajah
			
		}
		System.out.println("fefwqe");

	}

}