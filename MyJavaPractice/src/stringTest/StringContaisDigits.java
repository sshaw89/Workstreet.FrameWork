package stringTest;

public class StringContaisDigits {

	public static void main(String[] args) {
	System.out.println(stringContaisDigit("abc1023456789"));
	countTheLetters("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

	}
	public static boolean stringContaisDigit(String s) {
		boolean flag = false;
		char[] ch = s.toCharArray();
		for(char c:ch) {
			if(c>=49&&c<=57) {
				flag = true;
			}else {
				flag = false;
			}
		}
			return flag;
		}
		
	
	public static void countTheLetters(String str) {
		str=str.toLowerCase();
		int latters =0;
		int space =0;                                              
		int number =0;                                             
		int other =0;
		char[] ch = str.toCharArray();
		for(char c : ch) {
			if(c>=48&&c<=57) {
				number++;
			}else if(c>=97&&c<=122) {
				latters++;
			}else if(c==32) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println(number);
		System.out.println(latters);
		System.out.println(space);
		System.out.println(other);
	}
	    	
}



