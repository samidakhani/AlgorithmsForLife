package threads;

public class LockExxample  extends Thread {
	
	String threadName;
	User user;
	
	public LockExxample(String threadName, User user) {
	    this.threadName=threadName;
	    this.user=user;
	}
	
	@Override
	public void run() {
       
		if(threadName=="Thread1")
			user.deposit(200);
		else
			user.withdraw(100);
				
	}

	public static void main(String[] args) {

		User user1=new User("Sami");
		
		LockExxample thread1=new LockExxample("Thread1",user1);
		LockExxample thread2=new LockExxample("Thread2",user1);

		thread1.start();
		thread2.start();	
	}

}
