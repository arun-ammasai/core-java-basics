package pack1;

public class Class2 {
	public void class2Method() {
		System.out.println("Message from Class2 Method");
	}
	
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.class1Method();
		System.out.println(obj.x);
		//obj.class1Method2();
		System.out.println(obj.y);
		obj.class1Method3();
		System.out.println(Class1.a);
		System.out.println(obj.a);
	}
}
