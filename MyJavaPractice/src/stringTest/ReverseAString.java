package stringTest;


public class ReverseAString {
    //and checking String is palenendrome or not
	public static void main(String[] args) {
		String str =  "madam";
		String rev = "";
		for(int i = str.length()-1; i>=0; i--)
		{
		     rev = rev+str.charAt(i);	
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("its a palendrome");
		}else {
			System.out.println("its not palendrome");
		}
		reverse("avinesh");
		

	}
	public static void reverse(String str) {
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i>=0; i--) {
		   rev = rev+ch[i];	
		}
		System.out.println(rev);
		
	}

}
