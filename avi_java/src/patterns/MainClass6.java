package patterns;

public class MainClass6 {

	public static void main(String[] args) {
		int n = 4 , st = 1 , sp = n-1 , m=st/2;
		for(int i = 1 ; i<=n; i++)
		{
		  for(int j = 1;j<=sp;j++)
		  {
			  System.out.print("   ");
		  }
		  for(int k = 1; k<=st; k++)
		  {
			  if(k==1||k==st||k==m)
			  {
				  System.out.print(" * ");
			  }
			  else
			  {
				  System.out.print("   ");
			  }
			  
			 
		  }
		  System.out.println();
		  st++;
		  sp--;
		}

	}

}
