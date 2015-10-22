package threads;

public class SemaphoreExample extends Thread {

	String threadName;
	Foo foo;
	
	public SemaphoreExample(String threadName, Foo foo) {
	    this.threadName=threadName;
	    this.foo=foo;
	}
	
	@Override
	public void run() {
       
		try {
		 if(threadName=="Thread1")
			foo.first();
		 else if(threadName=="Thread2")
			foo.second();
		 else
			foo.third();
	    } catch (InterruptedException e) {
				e.printStackTrace();
	    }
				
	}

	public static void main(String[] args) throws InterruptedException {

		Foo foo=new Foo();
		
		SemaphoreExample thread1=new SemaphoreExample("Thread1",foo);
		SemaphoreExample thread2=new SemaphoreExample("Thread2",foo);
		SemaphoreExample thread3=new SemaphoreExample("Thread3",foo);

		thread3.start();
		thread2.start();
		thread1.start();
		
	}
	
	

}
