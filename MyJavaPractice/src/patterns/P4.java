package patterns;

public class P4 {
	public static void main(String[] args)
	{ 
		int n = 9;
		for(int i=1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
			if((i+j)>=(n+1))			
			{
				System.out.print(" * ");
			}
			else if((i+j)>=5)
			{
				System.out.print("  ");
			}
			}
			System.out.println(" ");
		}
		
	}

}
