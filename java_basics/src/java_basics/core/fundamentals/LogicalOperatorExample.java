package java_basics.core.fundamentals;
class LogicalOperatorExample 
{
	public static void main(String[] args) 
	{
		// && || !
		int a =10;
		int b =5;
		int c = 20;
		System.out.println(" && Condition :"+(a<b && a<c)); // true && false
		System.out.println(" || Condition :"+(a<b || a<c)); // true
		System.out.println(" ! Condition :"+!(a<b && a<c)); // true && false
	}
}
