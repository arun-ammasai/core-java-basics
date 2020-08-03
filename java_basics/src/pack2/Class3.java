package pack2;

import pack1.Class1;

public class Class3 extends Class1{
	public void class3Method() {
		System.out.println("Message from Class3 Method");
	}
	
	public static void main(String[] args) {
		Class3 obj = new Class3();
		obj.class1Method();
		System.out.println(obj.x);
		//obj.class1Method2();
		System.out.println(obj.y);
		obj.class1Method3();
	}
}
