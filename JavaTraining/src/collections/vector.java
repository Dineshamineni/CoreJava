package collections;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {

    Vector v = new Vector(5,2);
    v.add("dinesh");
    v.add(12);
    
    System.out.println(v.capacity());
    System.out.println(v.size());

	}

}
