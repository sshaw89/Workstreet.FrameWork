package patterns;

public class P1 {
		public static void main(String[] args)
		{
			//3 loops
			int n = 9 , mid = (n/2)+1 , st = 1 , sp = mid-1;
			for(int i = 1; i<=n ; i++)
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
				if(i<mid)
				{
					st++;
					sp--;
				}
				else 
				{
					st--;
					sp++;
				}
			}
			

		}

	}



