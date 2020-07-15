package java_basics.core.oops;

class Bird {
	void fly() {
		System.out.println("Here we go Flyyyyyyyyyyy...");
	}
}

class Eagle extends Bird {
	void heightLevel() {
		System.out.println("FLy Eagle");
	}

}

class Pegion extends Bird {
	void pegionMethod() {
		System.out.println("Pegion Flying away");
	}
}

public class HierarchialInheritanceExample {
	public static void main(String[] args) {
		Pegion peg = new Pegion();
		peg.pegionMethod();
		peg.fly();
		Eagle ea = new Eagle();
		ea.heightLevel();
		ea.fly();
	}
}
