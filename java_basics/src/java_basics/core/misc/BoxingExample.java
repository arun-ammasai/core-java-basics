package java_basics.core.misc;

public class BoxingExample {
	public static void main(String[] args) {
		// primitive to Wrapper
		int x = 10;
//		int y = null;
		Integer y = null;
		Integer  a = Integer.valueOf(x); // converting int to Integer
		Integer b = x; // compiler will do .valuOf
		System.out.println("Primitive :"+x);
		System.out.println("Wrapper Value Of :"+a);		
		System.out.println("Wrapper Integer :"+b);
		double a1 = 10.5d;
		Double a2 = a1;
	}
}

