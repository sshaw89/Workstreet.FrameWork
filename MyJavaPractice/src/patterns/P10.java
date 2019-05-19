package patterns;

public class P10 {

		public static void main(String[] args) {
		  UpperTriangleStar(5);

		}
		public static void UpperTriangleStar(int n) {
			for(int i = 1; i<=n; i++) {
				for(int j = 1; j<=n; j++) {
					if(i<=j) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
			
		}

	}



