package patterns;

public class Patternclass3 {

	public static void main(String[] args) {
		// second way of pattern 2
		int n = 5;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=n ; j++)
			{
			   if((i+j)>=(n+1))
			   {
				   System.out.print(" * ");
			   }
			   else
			   {
				   System.out.print("   ");
			   }
				
			}
			System.out.println( );
		
		}

	}

}
