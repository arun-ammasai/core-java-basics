package java_basics.core.fundamentals;

public class StringMethodsExample {
	public static void main(String[] args) {
		String str1 = "Java Basics";
		int length = str1.length();
		System.out.println("Length is :" + length);
		System.out.println(str1.toUpperCase());
		str1 = "Java Basics Demo";
		System.out.println(str1);
		
		String str2 = "Hello";
		String str3 = "World"; // + or concat
		System.out.println(str2.concat(" ").concat(str3));
		System.out.println(str2+" "+str3);
		
		String str4 = "XXX";
		System.out.println(str4.isEmpty());
		
		String str5 = str4.replace("XXX", "Hulk");
		System.out.println(str5);
		
		String str6 = str4.replaceFirst("X", "Y");
		System.out.println(str6);
		
		String str7 = str4.replaceAll("X", "Y");
		System.out.println(str7);
		
		
	}
}
