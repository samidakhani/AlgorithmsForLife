package threads;

public class SynchronisedExample extends Thread {

	String threadName;
	India india;
	
	public SynchronisedExample(String threadName, India india) {
	    this.threadName=threadName;
	    this.india=india;
	}
	
	@Override
	public void run() {
       
		india.displayState(threadName);
				
	}
	
	public static void main(String[] args) {
		
		India state1=new India("Karnataka");
		
		SynchronisedExample thread1=new SynchronisedExample("Thread 1",state1);
		SynchronisedExample thread2=new SynchronisedExample("Thread 2",state1);

		thread1.start();
		thread2.start();
	}

}
