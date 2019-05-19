package arrays;
//this class is made to support the StringArrayTest class in the same package.
public class student {
		int id;
		String name;
		  student(int id, String name){
			this.id = id;
			this.name = name;
		  }
		  public String toString() {
			  return "The name of Student is "+ this.name+ " and Id is " + this.id;
		  }
}
