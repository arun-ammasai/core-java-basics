package java_basics.core.control_statement;

public class NestedIfExample {
	public static void main(String[] args) {
		int num =20;
		if(num<100) { // 50 < 100
			System.out.println("Number is less than 100");
			if(num>25) { // 50 > 25
				System.out.println("Num is greater than 25");
			}
		}
	}
}
