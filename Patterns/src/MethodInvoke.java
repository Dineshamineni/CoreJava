
public class MethodInvoke {

	public static void main(String[] args) {
		/*
		 * Factorial f = new Factorial(); f.main(args, 10);
		 */
		fact(10);

	}

	protected static void fact(int n) {
		int output;
		int out = 1;
		for (int i = 1; i < n; i++) {
			output = (n - i);
			out = out * output;
			// System.out.println(out);
		}
		System.out.println(n * out);
	}
}
