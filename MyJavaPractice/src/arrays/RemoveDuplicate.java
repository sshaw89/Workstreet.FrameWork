package arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 int[] arr = {1,1,2,2,3,3,4,4,5,6,7,8,9};
		  
		 for(int i = 0; i<=arr.length-1; i++){
			 int count = 1;
			 for(int j = i+1; j<=arr.length-1; j++){
				 if(arr[i]==arr[j]) {
					 count++;	
				 }
				 if(count++ ==1) {
					 System.out.println(arr[i]);
				 }
				 
			 } 
		 }

	}

}
