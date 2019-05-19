
public class Practice1 {
//we can overload the main method but jvm executes only string args and another we have to call explicitly
	public static void main(String[] args) {
	
       System.out.println("as");
       main("avinesh");
	}
	public static void main(String args) {
		System.out.println(" "+args);
	}

}
