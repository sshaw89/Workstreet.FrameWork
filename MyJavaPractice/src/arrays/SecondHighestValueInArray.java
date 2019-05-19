package arrays;


public class SecondHighestValueInArray {

	public static void main(String[] args) {
		int temp;
		int[]  arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int i = 0;i<=arr.length-1; i++) {
			for(int j = 0; j<=arr.length-1; j++ ) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				System.out.println(arr[i]);
		
			}
			
		
			
		}
	

	}

}
