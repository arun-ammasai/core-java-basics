package java_basics.core.misc;

public class ThisKeyWordExample3 {
	
	int x;
	int y;
	
	ThisKeyWordExample3(){
		x = 10;
		y = 20;
		System.out.println("Message from Default Constructor");		
	}
	
	ThisKeyWordExample3 get() {
		return this;
	}
	void show() {
		System.out.println("Value X:" + x + " Value Y:" + y);
	}

	public static void main(String[] args) {
		ThisKeyWordExample3 obj = new ThisKeyWordExample3();
		ThisKeyWordExample3 obj1 = obj.get();
		obj1.show();
	}

}
