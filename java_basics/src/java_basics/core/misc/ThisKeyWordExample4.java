package java_basics.core.misc;

public class ThisKeyWordExample4 {
	
	int x;
	int y;
	
	ThisKeyWordExample4(){
		x = 10;
		y = 20;
		System.out.println("Message from Default Constructor");		
	}
	
	void get() {
		show(this);
	}
	void show(ThisKeyWordExample4 obj) {
		System.out.println("Value X:" + obj.x + " Value Y:" + obj.y);
	}

	public static void main(String[] args) {
		ThisKeyWordExample4 obj = new ThisKeyWordExample4();
		obj.get();
	}

}
