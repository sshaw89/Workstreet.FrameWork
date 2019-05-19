package ConstructorChaining;

public class MainClass4 {

	public static void main(String[] args) {
		demo2 ref = new demo2(33.3);
		System.out.println(ref.i);
//argumented super statements used  to call argumented constructor...		

	}

}
class demo1{
	int i;
	demo1(int arg)
	{
		super();
       int i =20;
       this.i = i;
		System.out.println("int arg cons in demo1");
		
	}
}
class demo2 extends demo1{
	demo2(double arg)
	{
		super(12);
		System.out.println("double cons in demo2");
	}
}