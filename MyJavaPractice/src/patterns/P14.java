package patterns;

public class P14 {

	public static void main(String[] args) {
		triangleDigits(5);
	
	}
	public static void triangleDigits(int n ) {
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n; j++ )
			{
				if(i+j<=n+1){
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
