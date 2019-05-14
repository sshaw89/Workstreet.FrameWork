package com.java.practice;
/**
 * 
 * @author Subrat
 *
 */

public class ChocolateWrapper {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int money=10;
		int price=2;
		int wrap=3;
		System.out.println(countMaxChocolate(money, price, wrap));

	}
	public static int countRec(int choc,int wrap) {
		//if number of chocolates is less then number of wrapper required
		if(choc<wrap) {
			return 0;
		}
		//we can immediately get new chocolates using wrapper of chocolate
		int newchocolate=choc/wrap;
		//now we have new chocolate and wrappers
		return newchocolate+countRec(newchocolate+choc%wrap,wrap);
	}
	public static int countMaxChocolate(int money,int price,int wrap) {
		//chocolates we can directly buy from money
		int choc=money/price;
		//return number of chocolates from given number of chocolates
		return choc+countRec(choc, wrap);
	}

}
