package java_basics.core.oops;

class Teacher {
	String designation = "Teacher";
	String instituteName = "Global Learning";

	void display() {
		System.out.println("Designation :" + designation + " / Institute :" + instituteName);
	}

}

public class SingleInhertanceExample extends Teacher {
	public static void main(String[] args) {
		SingleInhertanceExample obj = new SingleInhertanceExample();
		//System.out.println(obj.designation);
		//System.out.println(obj.instituteName);
		obj.display();
		
	}
}
