package collections;
//2: Ask user to enter a number and then print the multiplication table of the input number.

public class MultiplicationTable {
	public static void main(String[] args) {

		int input = 5;
		int output;
		for (int i = 1; i <= 10; i++) {
			output = input * (i);
			System.out.println(output);
		}
	}
}
