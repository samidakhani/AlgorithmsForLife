package threads;

public class ThreadExample extends Thread {

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
	
		ThreadExample instance=new ThreadExample();
		instance.start();
		
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
