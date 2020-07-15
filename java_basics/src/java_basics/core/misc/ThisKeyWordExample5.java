package java_basics.core.misc;

public class ThisKeyWordExample5 {
	
	void add() {
		System.out.println("Message from Add Method");
	}
	
	void show() {
		this.add();
		System.out.println("Message from Show Method");
	}

	public static void main(String[] args) {
		ThisKeyWordExample5 obj = new ThisKeyWordExample5();
		obj.show();
	}

}
