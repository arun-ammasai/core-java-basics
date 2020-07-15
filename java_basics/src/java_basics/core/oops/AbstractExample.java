package java_basics.core.oops;

abstract class Machine {
	abstract void add();

	void show() {
		System.out.println("Message from SHow Method");
	}
	
	static void staticMethod() {
		System.out.println("Messgae From Static Method");
	}
	
	final void finalMethod() {
		System.out.println("Message From Final Method");
	}
}

public class AbstractExample extends Machine {

	void add() {
		System.out.println("This is Add Method");
	}
	
	void show() {
		System.out.println("Message from Abstract Example Show Method");
	}	

	public static void main(String[] args) {
		AbstractExample obj = new AbstractExample();
		obj.add();
		obj.show();
		obj.staticMethod();
		obj.finalMethod();
	}

}
