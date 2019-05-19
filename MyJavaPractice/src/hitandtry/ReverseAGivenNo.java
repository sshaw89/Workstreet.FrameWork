package hitandtry;

public class ReverseAGivenNo {

	public static void main(String[] args) {
		reverseNum(1234);

	}
	public static void reverseNum(int num) {
		int rev = 0;
		for(;num!=0;) {
			rev = rev*10;
			rev = num%10+rev;
			num = num/10;
			
		}
		System.out.println(rev);
	}

}
