package arrays;


public class StringArray {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[0] = "java";
		str[1] = "mava";
		str[2] = "wava";
		str[3] = "tava";
		str[4] = "bava";
		printArray(str);
		System.out.println("==========================");
		//or we can use conventional for loop;
		for(int i = 0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		

	}
	public static void printArray(String[] str) {
		for(String s : str) {
			System.out.println(s);
		}
	}

}
