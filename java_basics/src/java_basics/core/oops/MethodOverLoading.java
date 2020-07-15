package java_basics.core.oops;

class OverLoading { // static polymorphism
	void display(int x) {
		System.out.println("Value X:" + x);
	}

	void display(int x, int y) {
		System.out.println("Total :" + (x + y));
	}
}

public class MethodOverLoading {
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.display(20,30);
		obj.display(50);
	}
}
