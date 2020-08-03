package java_basics.core.misc;

class Person1 {
	Person1() {
		System.out.println("Person Default Constructor");
	}
}

class Employee extends Person1 {
	Employee() {
		super(); // Person1()
		System.out.println("Employee Default Constructor");		
	}
}

public class SuperWIthConstructor {
	public static void main(String[] args) {
		new Employee();
	}
}
