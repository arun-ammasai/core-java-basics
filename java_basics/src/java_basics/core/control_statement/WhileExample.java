package java_basics.core.control_statement;

public class WhileExample {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			//System.out.println(i);
			i++;
		}
		
		String[] cars = { "Honda", "Ford", "Ferrari" };
		int j=0;
		while(j<cars.length) {
			System.out.println(cars[j]);
			j++;
		}
	}
}
