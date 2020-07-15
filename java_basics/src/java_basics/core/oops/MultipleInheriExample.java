package java_basics.core.oops;

public class MultipleInheriExample implements BaseInterface{

	@Override
	public void method2() {
		System.out.println("Message from Method2");
		
	}

	@Override
	public void method1() {
		System.out.println("Message from Method1");
	}
	
	
	public static void main(String[] args) {
		/*Interface1 i1 = new MultipleInheriExample();		
		i1.method1();
		Interface2 i2 = new MultipleInheriExample();
		i2.method2();*/
		MultipleInheriExample obj = new MultipleInheriExample();
		obj.method1();
		obj.method2();
	}

}
