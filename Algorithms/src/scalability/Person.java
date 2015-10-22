package scalability;

import java.util.ArrayList;

public class Person {
	
	ArrayList<Person> friends;
	int personID;
	
	public int getID() { return personID; }
	
	public void addFreinds(Person p){
		
		friends.add(p);
	}

}
