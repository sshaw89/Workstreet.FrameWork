package arrays;

public class StringArrayTest {

	public static void main(String[] args) {
		student[] str = new student[5];
		str[0] = new student(12, "avi");
		str[1] = new student(13, "aviral");
		str[2] = new student(14, "abhi");
		/**
		 * if we use only for each than we will get address becoz we are assigning reference for the array.
		so we have to override tostring method.
		 */
		
		for(student s : str) {
			System.out.println(s.toString());
			//use if(str!= null) to avoid null point exception.
			if(str!=null)
			{
				System.out.println(s.id);
				System.out.println(s.name);
			}
			
		}

	}
	
		
	

}
