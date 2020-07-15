package java_basics.core.oops;

class Animal {
	void eat() {
		System.out.println("Animal Eating");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("Dog Barking");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("Weeping..");
	}
}

public class MultiLevelInheritanceExample {
	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.makeNoise();
		bd.weep();
		
		Dog dog = new Dog();
		dog.makeNoise();
		dog.eat();
	}
}
