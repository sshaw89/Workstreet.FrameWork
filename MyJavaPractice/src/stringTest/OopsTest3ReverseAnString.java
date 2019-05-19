package stringTest;

public class OopsTest3ReverseAnString {

	public static void main(String[] args) {
		System.out.println(sumOf(123));
		System.out.println(reverseStr("my name is avinesh"));
		System.out.println( reverseStrSplit());

	}
     public static int sumOf(int num) {
		if(num==0) {
			return 0;
		}
		return num%10+sumOf(num/10);
		
	}
     public static String reverseStr(String in) {
    	 String out ="";
    	 char[] ch = in.toCharArray();
    	 for(int i=in.length()-1; i>=0;i--) {
    		 out = out+ch[i];
    		 
    	 }
		return out;
    	 
     }
    //with the help of recursion we can do that.
     static String in = "this is my world";
     static String out = "";
     static int count = in.length()-1;
     
     public static  String reverseStrSplit() {
    	 
    	 if(count>=0) {
    		 out = out+in.charAt(count);
    		 count--;
    		 reverseStrSplit();
    	 }
    	    return out;
    	 
     }
     

}
