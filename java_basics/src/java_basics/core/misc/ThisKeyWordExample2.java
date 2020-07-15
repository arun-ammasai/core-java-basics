package java_basics.core.misc;

public class ThisKeyWordExample2 {
	int x;
	int y;
	
	ThisKeyWordExample2(){
		this(20,30);
		System.out.println("Message from Default Constructor");		
	}

	ThisKeyWordExample2(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("Message from Parameterized Constructor");
	}

	void show() {
		System.out.println("Value X:" + x + " Value Y:" + y);
	}

	public static void main(String[] args) {
		ThisKeyWordExample2 obj = new ThisKeyWordExample2();
	}

}
