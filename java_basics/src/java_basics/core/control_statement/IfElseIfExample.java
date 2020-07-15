package java_basics.core.control_statement;

public class IfElseIfExample {
	public static void main(String[] args) {
		int mark = 75;
		if(mark<35) {
			System.out.println("Failed");
		}else if(mark > 35 && mark < 50) {
			System.out.println("D grade");
		}else if(mark > 50 && mark <75) {
			System.out.println("C grade");
		}else if(mark>75 && mark < 90) {
			System.out.println("B Grade");
		}else if(mark > 90 && mark <=100) {
			System.out.println("A Grade");
		}else {
			System.out.println("Invalid");
		}
		
		
		
	}
}
