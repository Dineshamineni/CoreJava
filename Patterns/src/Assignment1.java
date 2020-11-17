
public class Assignment1 {

	public static void main(String[] args) {
		add(2, 4);
		evenorodd(2);
		multiply(100, 2);
		leapyear(2020);
		vowels("a");
		power(2, 2);
		factorialNumber(7);
		fibanocci(20);
		largestNum(12, 91, 15);
		smallestNum(12, 91, 15);
		average(10, 12, 20);
		pascal(8);
		ranking(66);
	}

	// Adding two numbers
	public static int add(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);
		return c;
	}

	// Given number is even or odd
	public static void evenorodd(int a) {
		if (a % 2 == 0) {
			System.out.println("Entered number is even number");
		} else {
			System.out.println("Entered number is odd number");
		}

	}

	// multiply two given numbers
	public static void multiply(int a, int b) {
		int c = a * b;
		System.out.println(c);

	}

	// check leap year
	public static void leapyear(int a) {
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("Entered year is a Leap Year");
		} else {
			System.out.println("Its not a leap Year");
		}

	}

	// check weather input is vowels or not
	public static void vowels(String a) {
		if (a.length() <= 1) {

			switch (a.toUpperCase()) {
			case "A":
				System.out.println("it is an vowel");
				break;
			case "E":
				System.out.println("it is an vowel");
				break;
			case "I":
				System.out.println("it is an vowel");
				break;
			case "O":
				System.out.println("it is an vowel");
				break;
			case "U":
				System.out.println("it is an vowel");
				break;
			default:
				System.out.println("it is consonant");
				break;
			}
		} else {
			System.out.println("Enter only one character");
		}
	}

	// calculate power of the number
	public static void power(int value, int power) {

		int c = 1;
		for (int i = 0; i <= power; i++) {
			c = c * value;
			// System.out.println(c);
		}
		System.out.println(c);
	}

	// factorial number
	public static void factorialNumber(int fnum) {
		int n = fnum;
		int output;
		int finaloutput = 1;
		for (int i = 1; i < n; i++) {
			output = (fnum - 1);
			fnum = output;
			// System.out.println(finaloutput + "*"+ output);
			finaloutput = finaloutput * output;
		}
		System.out.println(n * finaloutput);
	}

	// Fibanocci series
	public static void fibanocci(int series) {
		// following number is sum of before two values
		int a = 0;
		int b = 1;
		int c;
		System.out.println("0 \n1");
		for (int i = 0; i < series; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.println(c);
		}
	}

	// Largest number
	public static void largestNum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		} else if (b > a && b > c) {
			System.out.println(b + " is the largest number");
		} else
			System.out.println(c + " is the largest number");
	}

	// smallest number
	public static void smallestNum(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println(a + " is the smallest number");
		} else if (b < a && b < c) {
			System.out.println(b + " is the smallest number");
		} else
			System.out.println(c + " is the smallest number");
	}

	// display even num 1 to 100
	public static void evenNum() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// display odd num 1 to 100
	public static void oddNum() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	// average of 3 numbers
	public static void average(int a, int b, int c) {
		float d;
		d = (a + b + c);
		System.out.println(d / 3);
	}

	// cal area of square
	public static void areaofsquare(int a, int b) {
		float c;
		c = (a + b);
		System.out.println(c / 2);
	}

	// print pascal triangle
	public static void pascal(int length) {
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	//ranking of the student
	public static void ranking(int marks) {
		if (marks >= 60 && marks < 65) {
			System.out.println("Third Rank");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("First Rank");
		} else if (marks >= 75 && marks < 85) {
			System.out.println("First Rank");
		} else if (marks >= 85) {
			System.out.println("Distinction");
		} else {
			System.out.println("Fail");
		}
	}
	// first 100 prime numbers
	public static void primenumbers() {
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

}
