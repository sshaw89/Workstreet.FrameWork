package patterns;

public class P12Again {

	public static void main(String[] args) {
		starsTest(4);

	}
	public static void starsTest(int n) {
		for(int i =1; i<=n; i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print(i);
				if(j<i) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			}
		for(int i =n; i>=1; i--)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print(i);
				if(j<i) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			}
		
		
	}

}
