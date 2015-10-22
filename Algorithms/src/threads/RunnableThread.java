package threads;

public class RunnableThread implements Runnable {

	int count =0;
	
	@Override
	public void run() {
	
		System.out.println("Starting Thread");
		
		try{
		  while(count < 5){
			System.out.println("Executiing Thread");
			Thread.sleep(2000);
			count ++;
		  }
		}catch(InterruptedException e){
			System.out.println("Interupted Thread");
		}
		
		System.out.println("Ending Thread");
		
		
	}
	
	
	public static void main(String[] args) {
        
		System.out.println("Sarting Main Thread");
		
		RunnableThread instance=new RunnableThread();
		Thread thread=new Thread(instance);
		thread.start();
		
		try{
		  while(instance.count < 5){
			Thread.sleep(4000);
		  }
	    }catch(InterruptedException e){
		   System.out.println("Interupted Thread");
	     }
		
		System.out.println("Ending Main Thread");
		
	}

}
