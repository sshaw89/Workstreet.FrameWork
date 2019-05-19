package patterns;

public class Mainclass5 {

	public static void main(String[] args) 
	{
		int n=7 , mid = (n/2)+1;
		for(int i = 1; i<=mid ; i++)
		{
			for(int j = 1; j<=mid;j++)
			{
				if((i+j)>=5) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
		System.out.println();
			
		}
		
		for(int i = 1; i<=mid ; i++)
		{
			for(int j = mid; j>=1;j--)
			{
				if((i+j)>=5) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
					
				}
				
			}
			System.out.println();
			
		}
		
		

	}

}
