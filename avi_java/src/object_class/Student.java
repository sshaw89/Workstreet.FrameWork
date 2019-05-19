package object_class;
//for toString method... main method ho na ho chalega agar mainclass 1 me use karna ho to...
public class Student {
	int id;
	String name;
	
	public Student(int id , String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	


	
}


