package arrays;

public class ShortAnArray1 {

	public static void main(String[] args) {
		int[] in = {1,2,1,2,1,0,0,0,1,2,1,2,0,2};
		int[] out = shortArray(in);
		for(int i : out) {
			System.out.println(i);
		}
 
	}
	public static int[] shortArray(int[] in) {
		int x = 0, y = in.length-1;
		int[] out = new int[in.length];
		for(int i : in) {
			if(i==2) {
				out[x++]=i;
			}
		}
		for(int i : in) {
			if(i==1) {
				out[y--]=i;
			}
		}
		return out;
		
	}
	

}
