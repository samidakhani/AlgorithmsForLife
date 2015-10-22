package scalability;

import java.util.HashMap;

public class Machine {
	
	HashMap<Integer, Person> persons=new HashMap<Integer, Person>();
	
	int machineID;
	
	public int getMachineID(){
		return machineID;
	}
	
	public Person getPerson(int personID){
		return persons.get(personID);
	}

}
