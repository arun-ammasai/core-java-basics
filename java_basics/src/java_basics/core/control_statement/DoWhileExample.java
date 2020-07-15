package java_basics.core.control_statement;

public class DoWhileExample {
	public static void main(String[] args) {
		// do{}while(condition)
		int i=10;
		do {
			//System.out.println(i);
			i--;
		}while(i>=1);
		
		String[] cars = { "Honda", "Ford", "Ferrari" };
		int j=0;
		do {
			System.out.println(cars[j]);
			j++;
		}while(j<cars.length);
	}

}
