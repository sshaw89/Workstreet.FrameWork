package Polymorphism;

public class MainClass2_runtime {

	public static void main(String[] args) {
		Animal a = new dog();
		a.eat();
		

	}

}
class Animal{
	void eat() {
		System.out.println("eating...");
	}
}

class dog extends Animal{
	void eat() {
		System.out.println("eating bread....");
	}
}

class cat extends Animal{
	void eat(){
		System.out.println("eating rat....");
	}
}

class loin extends Animal{
	void eat() {
		System.out.println("eating meat...");
	}
}