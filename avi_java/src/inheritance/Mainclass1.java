package inheritance;
// single level inhertance

public class Mainclass1 {

	public static void main(String[] args) 
	{
		sample2 ref2 = new sample2();
		System.out.println("i value is "+ref2.i);
		ref2.run();
		System.out.println(ref2.d);
		System.out.println(ref2.s);
		ref2.run3();
	

	}

}
class sample1
{
	int i = 220;
	void run()
	{
		System.out.println("lets inharit its a super class");
	}
}
class sample2 extends sample1
{
double d = 3.5;
String s = "AVINESH JAIN";
void run3()
{
System.out.println("its a sub class");	
}
}
