package hitandtry;

public class Print0To100WithoutIntialize {
	 int i;
	/**
	 * we can use static and not not static as well, because the default value of static and not static is zero...and we not need
	 * to initialize.
	 * 
	 */

	public static void main(String[] args) {
		num(0);
		Print0To100WithoutIntialize s=new Print0To100WithoutIntialize();
		
		for(;s.i<=100;s.i++)
	  {
			System.out.println(s.i);
		}
		

	}
	//we can use recursion also.
	public static void num(int j)
	{
		if(j<100) {
			j++;
			System.out.println(j);
			num(j);
		}
	}

	}
