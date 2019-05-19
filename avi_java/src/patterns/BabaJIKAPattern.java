package patterns;

public class BabaJIKAPattern {
	public static void printEqiletralTriangle(int n) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printEqiletralTriangle(3);
	}

}
