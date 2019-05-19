package stringTest;

public class StringCountAlphabates {

	public static void main(String[] args) {
		countAlphabts("aabbcccabbc");

	}
	public static void countAlphabts(String in) {
		char[] arr = in.toCharArray();
		for(int i=0; i<arr.length;) {
			int count = 1;
			int j = i+1;
			while(arr[i]==arr[j]) {
				count++;
				j++;
				
			}
			System.out.print(arr[i]+":"+count+" ");
			i = i+count;
		}
	}

}
