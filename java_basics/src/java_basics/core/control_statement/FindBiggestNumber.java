package java_basics.core.control_statement;

public class FindBiggestNumber {
	public static void main(String[] args) {
		int a=1000, b= 200, c = 7000;
		//int a , int b int c
		if(a>=b && a>=c) {
			System.out.println("A is Bigger :"+a);
		}else if(b>=a && b >= c) {
			System.out.println("B is Bigger :"+b);
		}else {
			System.out.println("C is Bigger :"+c);
		}
		
	}
}
