package java_basics.core.misc;

public class CallByValueExample {
	
	int value = 10;
	
	void modify(int value) {
		value = value+50;
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		CallByValueExample obj = new CallByValueExample();
		System.out.println("Before :"+obj.value);
		obj.modify(1000);
		System.out.println("After :"+obj.value);
	}

}
