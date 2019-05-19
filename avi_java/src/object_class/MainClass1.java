package object_class;

import dummy.Demo;
//if not override the toString method it will return fullyqualifiedclassname@address
public class MainClass1 {

	public static void main(String[] args) {
		Student st1 = new Student(12 , "avinesh");
		String val1 = st1.toString();
		System.out.println(val1);//it will give address if not override.
		
		Demo ref = new Demo();//we have to import it...
		String val2 = ref.toString();
		System.out.println(val2);
		
		Object ob = new Object();//change it to java.lang
		String val3 = ob.toString();
		System.out.println(val3);
	//we call instantiate by import student class or by using fully qualified name...packagename.classname	
		dummy.Student st2 = new dummy.Student();
		String var4 = st2.toString();
		System.out.println(var4);
	}

}
