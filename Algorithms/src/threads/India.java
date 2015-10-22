package threads;

public class India {
	
	String state;
	
	public India(String state){
		this.state=state;
	}
	
	public synchronized void displayState(String threadName){
		
		System.out.println("Thread name: " + threadName + "--" + state);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
