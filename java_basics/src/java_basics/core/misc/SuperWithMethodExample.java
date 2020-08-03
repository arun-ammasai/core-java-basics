package java_basics.core.misc;

class Person {
	void show() {
		System.out.println("Messgae from Person SHow");
	}
}

class Student extends Person {
	void show() {
		System.out.println("Messgae from Student SHow");
	}
	void display() {
		show();
		super.show();
	}
}

public class SuperWithMethodExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}
