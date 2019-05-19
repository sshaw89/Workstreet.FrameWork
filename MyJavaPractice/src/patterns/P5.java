package patterns;

public class P5 {
	public static void printEqiletralTriangle(int n) {
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printEqiletralTriangle(5);
	}

}
