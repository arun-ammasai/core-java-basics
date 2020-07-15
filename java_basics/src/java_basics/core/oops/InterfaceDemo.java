package java_basics.core.oops;

public class InterfaceDemo implements InterfaceExample{
	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.add();
		
		InterfaceExample ie = new InterfaceDemo();
		ie.add();
		//ie.x = 20;
		System.out.println(ie.x);
		
	}
	
	public void add() {
		System.out.println("Message From Add Method");
	}

}
