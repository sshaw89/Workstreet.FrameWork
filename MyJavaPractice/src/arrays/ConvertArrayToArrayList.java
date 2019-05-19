package arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		int[] in= {1,222,33,3,3,3,3,3333,3,33};
		//List<Integer> lst = Arrays.asList(in);
		//convert string array to list
		String sArray[] = new String[] { "A", "B", "C" };
        // convert array to list #1
		List<String> list = Arrays.asList(sArray);
        System.out.println(list);
        
        //int array 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List lst = Arrays.asList(arr);
        System.out.println(lst.size());

	}

}
