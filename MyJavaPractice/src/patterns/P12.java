package patterns;

public class P12 {

	public static void main(String[] args) {
		digitsTri(4);

	}
	public static void  starsAndDigits(int n) {
		int star = 1, mid = n/2;
		for(int i= 1; i<=n; i++ ) 
		{
			for(int j = 1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			star++;
			else
				star--;
		}
	}

	public static void  digitsTri(int n) {
		int x=n,y=1;
		for(int i=1;i<=(2*n);i++) {
			if(i<=n) {
				for(int j=1;j<=n;j++) {
					if(i>=j) {
						System.out.print(i+"*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}else {
				for(int j=1;j<=n;j++) {
					if(y+j<=n+1) {
						System.out.print(x+"*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
				x--;y++; 
			}
		}
	}

}
