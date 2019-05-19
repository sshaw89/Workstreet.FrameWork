package hitandtry;

class By{
	static int id() {
		return 10;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		
	int j = By.id();
	System.out.println(j+20);
	System.out.println(SumOfNumbers.sumOfnNumbers(10));
	//we can call a static method from another class by creating object and also by using classname.mambername.

	}
}
