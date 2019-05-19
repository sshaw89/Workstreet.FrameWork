package arrays;

public class LenthOfArrayWithoutBuildInMEthod {

	public static void main(String[] args) {
		new LenthOfArrayWithoutBuildInMEthod().lengthOfArray();
		int[]  arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int counter = 0;
		for(int j : arr)
		{
			counter++;
		}
		
		System.out.println(counter);
	}
	public void lengthOfArray() {
		int count = 0;
		int i;
		int[] arr= {12,23,43,55,65,21,33};
		try {
			while(true)
			{
				i = arr[count];
				count++;
			}
		}
	    catch(Exception ex){
				System.out.println(count);
			}
		}
		
	
	}

