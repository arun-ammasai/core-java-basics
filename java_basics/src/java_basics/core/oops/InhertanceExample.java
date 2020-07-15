package java_basics.core.oops;

class ParentClass{
	int x = 10;
	
	void add() {
		System.out.println("Messgae from Add method");
	}
}
public class InhertanceExample extends ParentClass{
	void show() {
		System.out.println("Message From Show methods");
	}
	public static void main(String[] args) {
		InhertanceExample obj = new InhertanceExample();
		obj.add();
		obj.x = 25;
		System.out.println(obj.x);
		obj.show();
		
	}

}
