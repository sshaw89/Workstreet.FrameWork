package oopsConcept;

public class GettersTest1 {
	private String empname;
	private int id;
	private void m1() {
		System.out.println("private method");
	}
	

	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		GettersTest1 gt1 = new GettersTest1();
		gt1.m1();
		gt1.setEmpname("avi");
		gt1.setId(420);
		System.out.println(gt1.getEmpname());
		System.out.println(gt1.getId());
	
		
		
		

	}

}
