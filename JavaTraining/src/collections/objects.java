package collections;
import java.util.*;

//storing values in to the class
class student{
	int rollno;
	String name, address;
	
	//constructor --should be the same name as class
	student(int rollno, String name, String address){
		this.rollno=rollno;
		this.name=name;
		this.address=address;		
	}	
}

public class objects {	
	public static void main(String[] args){
		//creating object
		List<student> list = new ArrayList();
		student s1 = new student(1, "Dinesh", "Anantapur");
		student s2 = new student(2, "Amineni", "hyderabad");
		student s3 = new student(3, "kumar", "Anantapur");
		student s4 = new student(4, "Dinu", "bangalore");
		
		//store group of objects into list 
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(student s:list){
			System.out.println(s.rollno+" "+s.name+" "+s.address);
		}
		
		
	}
}
