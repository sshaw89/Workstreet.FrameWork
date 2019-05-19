package patterns;

public class Patternclass11 {

	public static void main(String[] args) 
	{
		// using 3 loops...diamond in k loop put i and k value to see the magic
		int n = 5 , mid = (n/2)+1 , st = 1 , space = mid-1;
        for(int i = 1;i<=n;i++)
        {
        	for(int j = 1;j<=space; j++)
        	{
        		System.out.print("   ");
        	}
        		for (int k = 1; k<=st;k++)
        		{
        			if(k==1||k==st) 
        			{
        			System.out.print(" * ");
        			}
        			else 
        			{
        				System.out.println("   ");
        			}
        		}
        		
        			System.out.println( );
        			if(i<mid) 
        			{
        				space--;
        				st += 2;
        			}
        			else
        			{
        				space++;
        				st -= 2;
        			}
        		}
        }
	}

        		
        	
        
	





