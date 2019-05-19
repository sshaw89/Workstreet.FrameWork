package hitandtry;

public class PowerOfTwo {
	public static void main(String[] args) {
	  powerOfTwo(5);
	  System.out.println(Test.powerOfTwoRecursion(5));

	}
	public static void powerOfTwo(int j) {
		int res = 1;
		for(int i = 1; i<=j; i++) {
			res = res*2;
		}
		System.out.println("power of 2 is "+res);
	}

}
class Test{
	static int powerOfTwoRecursion(int i) {
		if(i==0) {
			return 1;
		}else {
			return 2*powerOfTwoRecursion(--i);
		}
	}
}