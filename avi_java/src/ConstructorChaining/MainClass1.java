package ConstructorChaining;

public class MainClass1 
{
	//every class should have constructor if prgrammer not defines compiler will define

	public static void main(String[] args)
	{
		new cons1(12);// argumented constructor
		new cons2(); //non argumented constructor

	}

}
class cons1
{
	//programmer defined argumented constructor
   cons1(int arg) 
	{
	   System.out.println("avinesh");
		
	}
}
class cons2
{
  //default constructor
}