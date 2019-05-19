
public class Practice2 {
	int a = 20;
	static int b=100;

	public static void main(String[] args) 
	{
		Practice2 p = new Practice2();
		p.m1(50);
		//by creating the object for static method is possible...
	   
		
	}
	void m1(int a) 
	{
		System.out.println(a);//local variable
		System.out.println(this.a);//non static variable
		System.out.println(b);//static variable.
		
	}
	static void m2()
	{
		System.out.println(b);
	}

}
