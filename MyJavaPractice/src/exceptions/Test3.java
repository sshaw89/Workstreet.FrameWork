package exceptions;

import java.io.FileReader;

//if our compiler tell us there is a chance of getting exception the we handle it with "throws" keyword.
public class Test3 {

	public static void main(String[] args)throws Exception{
		FileReader fis = new FileReader("//d");
		System.out.println(fis);

	}

}
