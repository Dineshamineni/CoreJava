package collections;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// push() , pop() , peel(), empty(), search() 
		// LIFo -- last in first out 
		// push to add element  -- it will add in top, pop to remove element  it will remove the latest inserted value 
		Stack s = new Stack();
		s.add("dinesh");
		s.push(5);
		s.push("amineni");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(5));  // it will print from last 
		
		
		
	}

}
