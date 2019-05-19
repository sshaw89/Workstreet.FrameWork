package patterns;

public class P11 {

	public static void main(String[] args) {
		 UpperTriangleStarRt(5);

	}
	public static void UpperTriangleStarRt(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = n; j>=1; j--) {
				if(i<=j) {
					System.out.print(" * ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}


	}


