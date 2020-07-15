package java_basics.core.control_statement;

import java.util.Scanner;

public class SwitchCaseExample1 {
	public static void main(String[] args) {
		double a ,b ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value for A :");
		a=scanner.nextDouble();
		System.out.println("Enter Value for B :");
		b=scanner.nextDouble();
		System.out.println("Enter The Operation (+,-,*,/):");
		char operator = scanner.next().charAt(0);
		System.out.println("Operator is :"+operator);
		
		switch (operator) {
		case '+':
			System.out.println("Add :"+(a+b));
			break;
		case '-':
			System.out.println("Sub :"+(a-b));
			break;
		case '*':
			System.out.println("Mul :"+(a*b));
			break;
		case '/':
			System.out.println("Div :"+(a/b));
			break;
		default:
			System.out.println("Wrong Operator");
			break;
		}
		
	}
}
