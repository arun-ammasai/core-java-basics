package java_basics.core.oops;

public class Test {
	public static void main(String[] args) {
		System.out.println("Command-Line arguments are");

		for (String str : args) {
			// convert into integer type
			int argument = Integer.parseInt(str);
			System.out.println("Argument in integer form: " + argument);
		}
	}

}
