package TypeConversion;

public class Mainclass2 {

	public static void main(String[] args)

	{
	   X ref = new Y();// it checks left side ref(object) holds the value of specified class or not...
	   if(ref instanceof Z)
	   {
		 System.out.println("yes it is ");
	   }
	   else {
		  System.out.println("no its not ");
	   }
	
}
}