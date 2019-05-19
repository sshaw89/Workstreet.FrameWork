package hitandtry;

public class Hcf$$LcmOfTwoNum {
	public static void main(String[] args) {
		System.out.println(hcfoftwono(0, 4));
		System.out.println(lcmOfTwoNo(4, 0));
	}
	
	public static int hcfoftwono(int n, int m) {
		int min = n<m?n:m;
		int hcf = 0;
		for(int i=1;i<=min;i++) {
			if(n==0||m==0) {
        		return 0;
        	}
			if(n%i==0&&m%i==0)
				hcf= i;
		}
		return hcf;
		
	}
	 public static int lcmOfTwoNo(int n, int m){
	        int max = n>m?n:m;
	        int lcm = 0;
	        for(int i = max;i<=n*m; i++){
	        	if(n==0||m==0) {
	        		return 0;
	        	}
	            if(i%n==0 && i%m==0) {
	               lcm = i;
	            break;
	            }  
	        }
	        return lcm;
	 }
}
