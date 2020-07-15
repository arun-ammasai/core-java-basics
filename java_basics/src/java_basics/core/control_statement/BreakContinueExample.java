package java_basics.core.control_statement;

public class BreakContinueExample {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if(i==5) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("After For Loop");
		
		int counter=1;
		while(counter<=10) {
			if (counter ==6) {
				counter++;
				break;
			}
			System.out.println(counter+ " ");
			counter++;
		}
	}
}
