package exceptions;
// checked
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
		Thread.sleep(2345);
		System.out.println(2);
	}catch(InterruptedException e) {
		System.out.println("tham ja bc");
	}
		}
}
