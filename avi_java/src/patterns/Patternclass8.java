package patterns;

public class Patternclass8 
{

	public static void main(String[] args) 
	{
		// check it dude 
		int n = 5 , st = 1 , sp = n-1 ;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=sp; j++)
			{
				System.out.print("   ");
			}
			for(int k = 1; k<=st; k++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
			sp--;
			st +=2;
		}

	}

}
