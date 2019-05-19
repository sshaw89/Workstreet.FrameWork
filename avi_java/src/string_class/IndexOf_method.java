package string_class;

public class IndexOf_method {

	public static void main(String[] args) {
		String str = "javaDeveloper";
		int i = str.indexOf("va");
		System.out.println(i);//2
		System.out.println(str.indexOf("D"));//4
		
		System.out.println(str.indexOf("z"));//-1
		
		System.out.println(str.indexOf("e"));//first occurrence 5
		
		System.out.println(str.indexOf("e", 6));
		System.out.println("index of Dev  "+str.indexOf("Dev"));//4
		System.out.println("index of dev "+str.indexOf("dev"));//-1
		/*last index of method
		 * public int lastIndexOf(String s)
		 */
		System.out.println(" ");

	}

}
