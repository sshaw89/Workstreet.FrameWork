package patterns;

public class P9 {

	public static void main(String[] args) {
		lowerTriangle(5);

	}
	public static void lowerTriangle(int n) {
		for(int i = n; i>=1; i--) {
			for(int j = n; j>=1; j--) {
				if(i+j<=n+1) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
