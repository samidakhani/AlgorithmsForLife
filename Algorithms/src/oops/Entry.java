package oops;

public abstract class Entry {
	
	protected Directory parent;
	protected String name;
	
	protected long created;
	protected long lastUpdated;
	
	public Entry(String n, Directory p){
		name=n;
		parent=p;
	}
	
	public boolean delete(){
		if(parent == null) return false;
		return parent.deleteEntry(this);
	}

	public String getPath(){
		if(parent == null) return name;
		return parent.getPath() + "/" + name;
	}
	
	public abstract long getSize();
	
	public long getCreatedDate(){
		return created;
	}
	
	public long getLastUpdated(){
		return lastUpdated;
	}
	
	public String getName(){
		return name;
	}
	
	public void changeName(String n){
		name=n;
	}
}
