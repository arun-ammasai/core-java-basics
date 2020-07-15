package java_basics.core.fundamentals;
class InstanceVsStatic{
	int x = 10 ;
	static int y = 20 ;
	public static void main(String args[]){
		InstanceVsStatic s1 = new InstanceVsStatic();
		InstanceVsStatic s2 = new InstanceVsStatic();
		InstanceVsStatic s3 = new InstanceVsStatic();
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		s1.x= 25;
		System.out.println("AFter Update");
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);

		/* System.out.println(s1.y);
		System.out.println(s2.y);
		System.out.println(s3.y);
		s1.y= 30;
		System.out.println("AFter Update");
		System.out.println(s1.y);
		System.out.println(s2.y);
		System.out.println(s3.y); */
	}
}