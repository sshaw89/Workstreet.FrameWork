package arrays;

public class ShortAnArray {

	public static void main(String[] args) {
		int[] in= {1,2,1,2,1,1,1,0,2,0,0,0,1,1,};
		int [] out=shortarray(in);
		for(int i:out) {
			System.out.println(i);
		}
	}
	public static int[] shortarray(int[] in) {
		int x = 0,y=in.length-1;
		int[] out = new int[in.length];
		for(int i:in) {
			if(i==1) {
				out[y--] = i;
			}else if(i==2) {
				out[x++]=i;
			}
		}
		return out;
	}

}
