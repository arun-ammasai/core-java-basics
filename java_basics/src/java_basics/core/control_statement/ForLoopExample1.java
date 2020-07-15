package java_basics.core.control_statement;

public class ForLoopExample1 {
	// For each
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int num : arr) {
			System.out.println(num);
		}*/
		loop1:
		for(int i=1;i<=5;i++) {
			loop2:
			for(int j=1;j<=5;j++) {
				if(i==3 && j==3) {
					break loop1;
				}
				System.out.println(i +" "+j);				
			}
		}
	}

}
