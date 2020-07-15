package java_basics.core.fundamentals;
class AssignmentOperatorExample 
{
	public static void main(String[] args) 
	{
		// = , -= , += , *= , /=
		int x = 10;
		x +=3 ; // x = x+3;
		System.out.println("Values :"+x);
		x -= 4; // x = x-4;
		System.out.println("Values :"+x);
		x *= 3; // x = x*3;
		System.out.println("Values :"+x);
		x /= 2; //x = x/2;
		System.out.println("Values :"+x);

		int y = 0;
		int z = 0;
		++y;
		z++;
		System.out.println("Increment Y:"+(y));
		System.out.println("Increment Z:"+(z));
	}
}
