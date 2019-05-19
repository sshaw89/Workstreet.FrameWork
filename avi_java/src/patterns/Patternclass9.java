package patterns;

public class Patternclass9 
{
	//do not change the j value becoz it will take care of spaces from console side  
    public static void main(String[] args) 
	{
		// check it dude
		int n = 5 , st = 9 , sp = 0 ;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=sp; j++)
			{
				System.out.print("   ");
			}
			for(int k = st; k>=1; k--)
			{
				System.out.print(" * ");
			}
			System.out.println( );
			sp++;
			st -=2;
		}

	}

}


