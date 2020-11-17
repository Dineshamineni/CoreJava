package collections;
/*
1: Print HELLO for the given string "AHCECLWLXO"
2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"

*/
public class Hello {

	public static void main(String[] args) {
		
		String input = "ahceclwlxo";
		/*
		 * String output = "";
		// String output = input.charAt(index)
		for (int i = 1; i < input.length(); i = i + 2) {
			output = output + input.charAt(i);
			// System.out.println(output);
		}
		System.out.println(output.toUpperCase());
		System.out.println(output.toLowerCase());
		System.out.println(output.substring(0,1).toUpperCase()+output.substring(1).toLowerCase());
		*/
		
		String[] split = input.split("");
		for(int i =1; i<split.length;i=i+2){
			
			System.out.print(split[i]);
		}
		System.out.println("\n---------");
	
	}

}
