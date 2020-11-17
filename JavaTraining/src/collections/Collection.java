package collections;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		//list with string datatype
		List<String> al = new ArrayList<>();
		
		al.add("Dinesh");
		al.add("kumar");
		al.add("Amineni");
		al.add(1,"dinu");
		System.out.println(al.get(1));
		
		List<String> al1 = new ArrayList<>();
		al1.add("Dinesh");
		al1.add("kumar");
		al1.add("Amineni");
		al1.addAll(2,al);
		al1.remove(1);
		al1.remove("Amineni");
		//al1.removeAll(al);
		al1.set(2, "hey");
		al1.sort(String.CASE_INSENSITIVE_ORDER);
	//		al1.clear();
		System.out.println(al1);
		System.out.println(al1.equals(al));
		System.out.println(al1.contains("Dinesh"));
		System.out.println(al.isEmpty());
		System.out.println(al1);
		System.out.println(al1.indexOf("Dinesh"));
		System.out.println(al1.lastIndexOf("Dinesh"));
		System.out.println(al1.subList(2, 3));
		

		
		
		/*
		 * 
		//ListIterator 
		Iterator<String> itr =  al.iterator();
		//foreach with iterator 	
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
		//foreach lambda Streams
		al.forEach(a->{
			System.out.println(a);
		});
		
		
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		ListIterator itr1 =  al.listIterator();
		while(itr1.hasPrevious()){
			System.out.println(itr1.previous());
		}
		
		//for loop method
for (String s:al){
	System.out.println(s);
}

//using for loop 
for (int i=0;i<al.size(); i++){
	System.out.println(i);
}
*/

	}

}
