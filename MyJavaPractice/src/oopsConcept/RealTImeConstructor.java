package oopsConcept;

public class RealTImeConstructor {

	public static void main(String[] args) {
		RegisterOnIrctc r1 = new RegisterOnIrctc("avi", 12223425, "lalitpur");
		RegisterOnIrctc r2 = new RegisterOnIrctc("avinesh", 1223143);
	   System.out.println(r1.name);
	   System.out.println(r2.name);

	}

}
class RegisterOnIrctc{
	String name;
	int adharno;
	String home;
	
	public RegisterOnIrctc(String name, int adharno, String home) {
		this.name  = name;
		this.adharno = adharno;
		this.home = home;
	}
	public RegisterOnIrctc(String name, int adharno) {
		this.name  = name;
		this.adharno = adharno;
		
	}
}
