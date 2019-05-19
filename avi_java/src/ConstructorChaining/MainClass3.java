package ConstructorChaining;

public class MainClass3 {

	public static void main(String[] args) {
		sam2 ref = new sam2();
		System.out.println(ref.a);
		

	}

}
class sam1{
	int a = 100;
	sam1(){
		super();//non argumented super statement programmer defined 
		System.out.println("cons in sam1");
	}
}
class sam2 extends sam1{
	sam2(){
		super();
		System.out.println("cons in sam2");
	}
}
