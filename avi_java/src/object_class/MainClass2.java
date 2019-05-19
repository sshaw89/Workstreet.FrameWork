package object_class;//want to override lets do it in student class

public class MainClass2 {
//if overriding the toString method it will return the data members of class but it can return any string value
	public static void main(String[] args) {
		Student st1 = new Student(11, "Avinesh");
		String val1 = st1.toString();
		System.out.println(val1);
		System.out.println("st1 : "+st1);
		
		

	}

}
