//--10!//3,628,800
/*
 * 3!
 * 
 * 3*(3-1)*(3-2)
 */
public class Factorial {

	public static void main(String[] args) {
		// n*(n-1)
		MethodInvoke mi = new MethodInvoke();
		mi.fact(10);;
		
		
		int n = 10;
		int length = n;
		int output = 0;
		int outputval = 1 ;

		
		for (int i = 1; i < length; i++) {
			output = (n - 1);
			n =output;			
			outputval =outputval*output;
			//System.out.println(outputval);
		}
		
		System.out.println("output : " + length*outputval);
	}

}
