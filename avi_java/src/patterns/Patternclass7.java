package patterns;

public class Patternclass7
//3 loops just change some elements and see the magic...
{
    public static void main(String[] args)
	{
		int n = 9 , mid = (n/2)+1 , st = mid;
		for(int i = 1 ; i<=n ; i++)
		{
			for(int k = 1; k<=st; k++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
			if(i<mid) 
			{
				st--;

			}
			else 
			{
				st++;

			}
			
		}
		

	}

}



