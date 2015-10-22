package oops;

import java.util.ArrayList;

public class Directory extends Entry{
	
	ArrayList<Entry> contents=null;
	
	public Directory(String n, Directory p) {
		super(n, p);
		contents= new ArrayList<Entry>();
	}

	public long getSize(){
		int size=0;
		for(Entry e : contents){
			size +=e.getSize();
		}
		return size;
	}
	
	public int noOfFiles(){
		
		int number=0;
		
		for (Entry e : contents) {
			
			if(e instanceof File){
				number +=1;
			}else if(e instanceof Directory){
				number += 1 + ((Directory)e).noOfFiles(); 
			}
		}
		
		return number;
		
	}
	
	public boolean deleteEntry(Entry e){
		return contents.remove(e);
	}
	
	

}
