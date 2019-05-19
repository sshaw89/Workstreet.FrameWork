package oopsConcept;

public class RealTimeObject {

	public static void main(String[] args) {
	  Vehicle v = new Vehicle();
	  System.out.println(v.color);
	  System.out.println(v.name);
	  System.out.println(v.tyre);
	  v.run();
	  v.turn();
	  

	}

}
class Vehicle{
      String color = "red";
      int tyre  = 4;
      String name = "mustang 1969";
      void turn() {
    	  System.out.println("car is turning");
      }
      
      void run() {
    	  System.out.println("car is running");
      }
      
}
