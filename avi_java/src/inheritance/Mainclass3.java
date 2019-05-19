package inheritance;
//hierarchical inheritance(generalization purpose..)
public class Mainclass3 
	{
		public static void main(String[] args) 
		{
			//here we can access only parent class and class3 members
			Samp3 ref = new Samp3();
			ref.m1();
			ref.m3(23);
			System.out.println(ref.s);
			//and to access parent class and class 2 we have to create another object
			System.out.println("===========================");
			Samp2 ref2 = new Samp2();
			ref2.m2();
			ref2.m1();
		}

	}
	class Samp1
	{
		int i = 20;
		void m1()
		{
			System.out.println("super class");
		}
	}
	class Samp2 extends Samp1
	{
		double d = 30;
		void m2()
		{
			System.out.println("sub class for 1 only ");
		}
	}
	class Samp3 extends Samp1
	{
		String s = "avinesh";
		void m3(int arg)
		{
			System.out.println("sub class for 1 only "+arg);
		}
		
	}


