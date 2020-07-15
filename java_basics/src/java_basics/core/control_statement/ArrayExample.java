package java_basics.core.control_statement;

public class ArrayExample {
	// Code Optimization - sort effeicient
	// Random Access - Using index

	// DisAdvantage
	// Size Limit

	public static void main(String[] args) {
		String[] cars = { "Honds", "Ford", "Ferrari" };
		String[][] names = {{"Honds", "Ford", "Ferrari"},{"ABC", "CDE", "FGH"}};
		cars[0] = "Honda";
		System.out.println(cars[2]);

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
