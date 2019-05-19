package patterns;

public class P7 {

	public static void main(String[] args) {
		lowerTriangle(5);

	}
	public static void lowerTriangle(int n) {
		int space = n-1, star = 1;
		for(int i = 1; i<=n; i++) 
		{
			for(int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<=star; k++) 
			{
				System.out.print(k);
			}
			star++;
			space--;
			System.out.println();
		}
		
	}

}
