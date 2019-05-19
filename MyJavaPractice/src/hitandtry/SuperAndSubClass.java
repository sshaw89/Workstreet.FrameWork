package hitandtry;

public class SuperAndSubClass {

	public static void main(String[] args) {
		subclass sb = new subclass();
		sb.test();

	}

}
class superclass{
	public  void test() {
		System.out.println("printing from super class");
	}
}
class subclass extends superclass{
	public void test() {
		System.out.println("displaying from subclass");
		super.test();
		
	
	}
}