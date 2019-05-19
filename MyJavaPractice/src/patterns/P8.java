package patterns;

public class P8 {

	public static void main(String[] args) {
		rightAngleWithAlphabates(4);

	}
	public static void rightAngleWithAlphabates(int n) {

		for(int i = 1; i<=n; i++)
		{
			char q = 'A';
			for(int j = 1; j<=i; j++) 
			{
	
				System.out.print(q);
				q++;
			}
	
			System.out.println();
		}
	}

}
