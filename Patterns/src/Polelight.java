	// divisible/2 == green color , divisible by3 red color, divisible by 5
		// blue color
public class Polelight {

	public static void main(String[] args) {

	

		int input = 15;

		if ((input % 2) == 0) {
			System.out.println("Green bulb for this pole");
		} else if (input % 3 == 0) {
			System.out.println("Red color bulb for this pole");
		} else if (input % 5 == 0 ||input % 3 == 0 ) {  //&&
			System.out.println("Blue color bulb for this pole");
		} else {
			System.out.println("Not yet decided the color use plain white");
		}

	}

}
