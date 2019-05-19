package patterns;

public class Patternclass2 {

	public static void main(String[] args) {
		//triangle
		int n = 5 , sp = (n-1) , st = 1;
		for(int i = 1; i<=n;i++)
		{
			for(int j = 1;j<=sp;j++)
			{
				System.out.print("   ");
			}
			for(int k = 1;k<=st;k++) 
			{
				System.out.print(" * ");
			}
			System.out.println( );
			sp--;
			st++;
		}

	}

}
