package java_basics.core.misc;

public class ThisKeyWordExample1 {
	int x;
	int y;
	
	ThisKeyWordExample1(int x,int y){
		this.x=x;
		this.y=y;
	}

	void show() {
		System.out.println("Value X:" + x + " Value Y:" + y);
	}

	public static void main(String[] args) {
		ThisKeyWordExample1 obj = new ThisKeyWordExample1(10,20);
		obj.show();
	}

}
