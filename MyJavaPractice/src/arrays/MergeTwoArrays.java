package arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,6,7,8,9,10};
		int[] c = new int[a.length + b.length];
		int counter = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			c[i] = a[i];
			counter++;
		}
		for(int j = 0; j<b.length; j++) {
			c[counter++] = b[j];
		}
		for(int merge : c) {
			System.out.println(merge);
		}

	}

}
