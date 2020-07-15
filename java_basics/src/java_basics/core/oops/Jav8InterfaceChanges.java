package java_basics.core.oops;


interface ForestAnimals{
	void makeNoise();
	
	default void add() {
		method1();
		method2();
		System.out.println("This msg from Deafult Method");
	}
	
	static void methodStatic() {
		method2();
		System.out.println("Message from Static Method");
	}	
	
	private void method1() {
		method2();
		System.out.println("Messgae From Private Method");
	}
	
	private static void method2() {
		System.out.println("Messgae From Private Method 2");
	}
	
}
class WildDog implements ForestAnimals{

	@Override
	public void makeNoise() {		
		System.out.println("I'm a Wild Dog !!!");
	}
	
	public void add() {
		System.out.println("This msg from Wild Dog Method");
	}
	
}

public class Jav8InterfaceChanges {

	public static void main(String[] args) {
		ForestAnimals fn = new WildDog();
		fn.makeNoise();
		fn.add();
		ForestAnimals.methodStatic();
	}

}
