package oopsConcept;

public class OopsTest2CompareNumbers {
//try to put else if and else in the place of if
	public static void main(String[] args) {
		comaparenumbers(10, 15);

	}
	public static void comaparenumbers(int n, int m) {
		if(n>m) {
			System.out.println("n is greater");
		}if(n<m){
			System.out.println("n is lesser");
		}if(n==m) {
			System.out.println("n equals to m");
		}if(n!=m) {
			System.out.println("n is not equal to m");
		}if(n>=m) {
			System.out.println("n is greater and equal to m");
		}if(n<=m) {
			System.out.println("n is lesser and equal to m");
		}
	}

}
