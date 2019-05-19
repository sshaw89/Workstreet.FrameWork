package Polymorphism;

public class Electricity {

	public static void main(String[] args) {
		Sample_Electricity ref = new Sample_Electricity();
		ref.supply("power grid 20MW");
		System.out.println("=====================");
		ref.supply("power grid " , 30);
		System.out.println("===================");
		ref.supply(40 , "thermal power 50MW");
		
		System.out.println("==============;;===============");
		
		Sample_electricity1 ref1 = new Sample_electricity1();
		ref1.supply("Nuclear power 200 MW");
		System.out.println("====================");
		ref.supply("power grid 20MW");
		System.out.println("=====================");
		ref.supply("power grid " , 30);
		System.out.println("===================");
		ref.supply(40 , "thermal power 50MW");
		

	}

}
