package java_basics.core.oops;

public class SimpleConstructor {
	
	String name;
	
	SimpleConstructor() {
		this.name = "Welcome Java Basics";
	}
	
	public static void main(String[] args) {
		SimpleConstructor obj = new SimpleConstructor();
		System.out.println(obj.name);
	}

}
