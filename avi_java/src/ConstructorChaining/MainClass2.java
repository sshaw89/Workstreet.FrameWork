package ConstructorChaining;

public class MainClass2 {

	public static void main(String[] args)
	{
		sample1 ref = new sample1();
		System.out.println(ref.i);
		
		

	}

}
class sample{
	sample(){
		System.out.println("constructor in sample ");
	}
}
class sample1 extends sample
{
	int i = 20;
  
	sample1()
	
	{
	
	System.out.println("cons in sample 2");	
	}
}