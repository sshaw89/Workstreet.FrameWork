package oopsConcept;

public class CleartripPrac2 {

	public static void main(String[] args) {
		//cornerStar(5);
		//triangle(5);
		//diamond(9);
		pattern(4);
		

	}
	public static void cornerStar(int num) {
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=num;j++) {
				if(i==1||i==5||j==5||j==1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	public static void triangle(int num) {
		int star= 1;
		for(int i = 1; i<=num;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			star++;
			
			
		}
		
	}
	public static void diamond(int num) {
		int mid= (num/2)+1, star = 1, space = mid-1;
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=space;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(" * ");
			}
			System.out.println();
			if(i<mid) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			
		}
		
	}
	public static void pattern(int num) {
	     for(int i = 1; i<=num; i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(i);
				 if(j<i) {
					 System.out.print("*");
					 }
				 
			 }
			 System.out.println();
			
		 }
	     for(int i = num; i>=1; i--) {
	    	 for(int j=1;j<=i;j++) {
				 System.out.print(i);
				 if(j<i) {
					 System.out.print("*");
					 }
				 
			 }
			 System.out.println();
			
		 }

	}

}
