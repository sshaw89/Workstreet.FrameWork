package blocks;

public class Mainclass3 {
//block get the highest priority
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(Sample1.i);
		System.out.println(Sample1.d);
		System.out.println(Sample1.i);
		
	  }
}

class Sample1{
	static int i;
	final static double d;
	static
	{
		i = 20;
		d = 3.3;
		System.out.println("static block in sample1");
	}
}