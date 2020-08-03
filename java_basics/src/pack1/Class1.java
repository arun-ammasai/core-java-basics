package pack1;

public class Class1 {
	public int x = 10;
	protected int y = 25;
	final int z = 100;
	static int a = 20;
	public void class1Method() {
		System.out.println("Message from Class1 Method");
	} 
	
	private void class1Method2() {
		System.out.println("Messgae from Class1 Method2");
	}
	
	public final void class1Method3(){
		System.out.println("Message from Class1 Method3");
	}
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.class1Method2();
		System.out.println(obj.y);
		//obj.z = 50 ;
		System.out.println(obj.z);
		obj.class1Method3();
		System.out.println(obj.a);
		System.out.println(a);
		System.out.println(Class1.a);
	}

}
