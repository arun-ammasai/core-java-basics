package java_basics.core.oops;

public class ParameterizedConstructor {
	
	int mobileNumber;
	String personName;
	
	ParameterizedConstructor(){
		
	}
	
	ParameterizedConstructor(int mobile, String name){
		this.mobileNumber = mobile;
		this.personName = name;
	}
	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(987654321,"Hobbs");
		System.out.println(obj.mobileNumber);
		System.out.println(obj.personName);
		
		ParameterizedConstructor obj1 = new ParameterizedConstructor();
	}
	

}
