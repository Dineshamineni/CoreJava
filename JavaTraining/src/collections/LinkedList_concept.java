package collections;
import java.util.*;

public class LinkedList_concept {

	public static void main(String[] args) {

	LinkedList<Student> list = new LinkedList<>();
	list.add(new Student(34));
	list.addLast(new Student(588));
// cannot add directly it is an object created as an constructor  list.addFirst(22);
	
	//or
	Student s2 = new Student(84);
	list.add(s2);
	
	Iterator itr = list.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next	());
		}
	
	
	
	
	}

}
class Student{
	int rollno;
	Student(int rollno){
		this.rollno=rollno;
	}
	public String toString(){
		return ""+rollno;
	}
}
