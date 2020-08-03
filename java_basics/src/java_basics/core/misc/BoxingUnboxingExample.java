package java_basics.core.misc;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		byte b = 10;
		short s = 30;
		int i = 40;
		long l = 50;
		float f = 10.5f;
		double d =60.8d;
		char c='A';
		boolean bo = true;
		//AutoBoxing
		
		Byte bObj = b;
		short sObj = s;
		Integer iObj = i;
		Long lObj = l;
		Float fObj = f;
		Double dObj =d;
		Character cObj=c;
		Boolean boObj = bo;
		
		// Print the Object
		System.out.println("---Printing object values---");  
		System.out.println("Byte object: "+bObj);  
		System.out.println("Short object: "+sObj);  
		System.out.println("Integer object: "+iObj);  
		System.out.println("Long object: "+lObj);  
		System.out.println("Float object: "+fObj);  
		System.out.println("Double object: "+dObj);  
		System.out.println("Character object: "+cObj);  
		System.out.println("Boolean object: "+boObj);
		
		byte bv = bObj;
		short sv = sObj;
		int iv = iObj;
		long lv = lObj;
		float fv = fObj;
		double dv=dObj;
		char cv=cObj;
		boolean bov = boObj;
		
		System.out.println("---Printing Primitive values---");  
		System.out.println("byte : "+bv);  
		System.out.println("short : "+sv);  
		System.out.println("integer : "+iv);  
		System.out.println("long : "+lv);  
		System.out.println("float : "+fv);  
		System.out.println("double : "+dv);  
		System.out.println("char : "+cv);  
		System.out.println("boolean : "+bov);
	}

}
