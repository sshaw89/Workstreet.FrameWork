package patterns;

public class Mainclass4 {

	public static void main(String[] args) 
	{ 
		int n = 9 , st = (n/2)+1 , mid = (n/2)+1;
		for(int i = 1 ;i<=n ;i++)
		{
			for(int j = 1 ;j<=st ;j++)
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


