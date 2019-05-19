package patterns;

public class P13 {

	public static void main(String[] args) {
	    ractangleStar(4);  

	}
	public static void ractangleStar(int n) {
						
		for(int i = 1; i<=n; i++) 
		{
		    int count = 4;
			for(int j = 1; j<=2*n; j++)
			{
				if(j<=n)
				System.out.print(j);
				else 
				  System.out.print(count--);
			}
			System.out.println();
		}
	}

}
