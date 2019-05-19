package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,5,2,3,5,4,5,4,5,4,};
		removeDuplicate(arr);
		

	}
	public static void removeDuplicate(int[] in) {
		int L = in.length;
		for(int i=0; i<L-1;i++) {
			for(int j =i+1;j<L;j++) {
				if(in[i]==in[j]) {
					in[j]=in[L-1];
					L--;
				}
				
			}
		}
		for(int k: in) {
			System.out.println(k);
		}
	}

}
