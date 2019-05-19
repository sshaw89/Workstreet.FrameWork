package patterns;

public class Patternclass5 
{

	public static void main(String[] args)
	{
		int n = 7 , mid = (n/2)+1 , st = 1;
		for(int i = 1; i<=n ; i++)
		{
			for(int k = 1; k<=st; k++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
			if(i<mid)
			{
				st++;
			}
			else
			{
				st--;
			}
		}
	}
}
		

	


