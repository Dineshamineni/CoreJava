
public class testmain {

	public static void main(String[] args) {
		int marks =65;
		if (marks > 60 && marks < 65) {
			System.out.println("Third Rank");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("Second Rank");
		} else if (marks >= 75 && marks < 85) {
			System.out.println("First Rank");
		} else if (marks >= 85) {
			System.out.println("Distinction");
		} else {
			System.out.println("Fail");
		}
	}
	}
