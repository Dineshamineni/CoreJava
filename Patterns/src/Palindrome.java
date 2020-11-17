//how to store the value in a variable which are getting in loop
public class Palindrome {

	public static void main(String[] args) {
		

	
		String input = "Dinesh";
		String reverse = "";
		for (int j = input.length() - 1; j >= 0; j--) {
			
		reverse = reverse +input.charAt(j);
		System.out.println(reverse);

		}
		System.out.println(reverse);
		if(reverse.equals(input)){
			System.out.println("Entered value is palindrome");			
		}else{
			System.out.println("Not a palindrome");
		}
	}
}