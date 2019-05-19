package ConstructorChaining;

public class MainClass5 {

	public static void main(String[] args) {
		demos2 ref = new demos2();
		System.out.println(ref.i);
	}

}
class demos1
{
	int i = 100;
	demos1()
	{
		System.out.println("non argumented demos1 cons");
	}
	demos1(int arg)
	{
		System.out.println("int arg demos1 cons");
	}
	
}
class demos2 extends demos1{
	demos2()
	{
		super(20);// give value to call super class constructor if dont give we get non arg constructor from super.
	 System.out.println("cons in demos2");
	}
}
