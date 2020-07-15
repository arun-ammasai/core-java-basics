package java_basics.core.misc;

class A {
	B obj;

	A(B obj) {
		this.obj = obj;
		obj.show();
	}
}

class B {
	int x = 50;

	B() {
		A obj = new A(this);
	}

	void show() {
		System.out.println("Value X :" + x);
	}
}

public class ThisKeyWordExample6 {
	public static void main(String[] args) {
		B obj = new B();
	}

}
