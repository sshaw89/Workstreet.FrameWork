package hitandtry;

public class StaticBlockTest {

	static {
		System.out.println("hello");
		}
	public static void main(String[] args) {
		System.out.println("hi");
		Smaple s =  new Smaple();
		System.out.println("so tab  "+"\t"+s.j);
	}

}
class Smaple{
	
	static {
		System.out.println("static block in smaple");
	}	
	{
		int i= 100;
		System.out.println("non static block "+i); //we can use it as local variable
	}
	int j;           // we can also declare it and use it when we need..
	{
		j  = 200;
		System.out.println("2nd non static block");
	}
}