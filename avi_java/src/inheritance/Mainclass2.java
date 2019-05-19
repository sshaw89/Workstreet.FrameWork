package inheritance;
//multilevel inheritance 3 to 2 , 2 to 1.

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		Sam3 ref = new Sam3();
		ref.m1();
		ref.m2();
		ref.m3(23);
	}

}
class Sam1
{
	int i = 20;
	void m1()
	{
		System.out.println("super class");
	}
}
class Sam2 extends Sam1
{
	double d = 30;
	void m2()
	{
		System.out.println("sub class for 1 and super for 3");
	}
}
class Sam3 extends Sam2
{
	String s = "avinesh";
	void m3(int arg)
	{
		System.out.println("sub class "+arg);
	}
	
}