package hitandtry;

public class RoundOff {

	public static int roundOff(int i) {
		if(i%10<5)
			return (i-i%10);
		else
			return (i+10-i%10);
	}
	public static void main(String[] args) {
		System.out.println(roundOff(23));
		System.out.println(roundOff(34));
		System.out.println(roundOff(299));
		System.out.println(roundOff(56));
		System.out.println(roundOff(234));
		System.out.println(roundOff(1));
		System.out.println(roundOff(10));
		System.out.println(roundOff(15));
	}
}
