package java_basics.core.misc;

class A1 {
	int x = 50;
}

class B1 extends A1 {
	int x = 100;

	void show() {
		System.out.println("The X Value is :" + super.x);
	}
}

public class SuperWithVariableExample {
	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();
		System.out.println(obj.x);
	}
}
