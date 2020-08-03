package java_basics.core.misc;

public class RecursionExample2 {
	public static void main(String[] args) {
		recursion();
	}
	
	static int count =0;
	
	static void recursion() {
		count++;
		if(count<=10) {
			System.out.println("Count # :"+count);
			recursion();
		}
	}
}
