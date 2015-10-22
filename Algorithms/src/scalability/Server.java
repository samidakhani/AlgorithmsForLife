package scalability;

import java.util.HashMap;

public class Server {
	
	HashMap<Integer, Integer>  personToMachineMap=new HashMap<Integer, Integer>();
	HashMap<Integer, Machine> machines=new HashMap<Integer, Machine>();
	
	public Machine getMachine(int machineID){
		return machines.get(machineID);
	}
	
	public int getMachineID(Integer personID){
		 return personToMachineMap.get(personID);
	}
	
	public Person getPersonWithID(Integer personID){
		
		Integer machineID=getMachineID(personID);
		
		if(machineID == null) return null;
		
		Machine machine=getMachine(machineID);
		
		return machine.getPerson(personID);
		
		
	     	
		
		
	}

}
