package java_basics.core.control_statement;

public class ForLoopCalculateSum {
	public static void main(String[] args) {
		int length = 10;
		int total=0;
		for(int i=1;i<=length;i++) {
			total = total+i;
		}
		System.out.println("Total is :"+total);
	}
}
