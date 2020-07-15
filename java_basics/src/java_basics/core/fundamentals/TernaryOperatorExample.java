package java_basics.core.fundamentals;
class TernaryOperatorExample 
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 50;
		int result = (a<b) ? a:b;
		System.out.println(result);
		/*if(a<b){
			System.out.println(a);
		}else{
			System.out.println(b);
		}*/
	}
}
