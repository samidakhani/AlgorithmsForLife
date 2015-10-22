package oops;

public class File extends Entry{
	
	String contents;
	long size;

	public File(String n, Directory p) {
		super(n, p);
	}
	
	public long getSize(){
		return size;
	}
	
	public String getContents(){
		return contents;
	}
	
	public void setContents(String c){
		contents=c;
		size=contents.length();
	}

}
