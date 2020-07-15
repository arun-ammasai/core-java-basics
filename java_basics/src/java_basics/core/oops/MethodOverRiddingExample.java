package java_basics.core.oops;

class WildAnimal{
	void makeNoise() {
		System.out.println("Default Sound");
	}
}
class Lion extends WildAnimal{
	void makeNoise() {
		System.out.println("Lion Roarrrrrrrrrrrr");
	}
}

public class MethodOverRiddingExample {
	public static void main(String[] args) {
		Lion obj = new Lion();
		obj.makeNoise();
	}

}
