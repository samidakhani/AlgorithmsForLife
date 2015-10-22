package threads;

public class Philosopher  extends Thread{
	
	String name;
	Chopstick left;
	Chopstick right;
	
	public Philosopher(String name,Chopstick left,Chopstick right){
		this.name=name;
		this.left=left;
		this.right=right;
	}
	
	public void eat(){
		
	  while(true){	
		if(pickUp()){
          chew();
		  putDown();
		  break;
		}
	  }
	}
	
	public void chew(){
		 for(int i=0;i<2;i++){
			System.out.println(name +" is chewing " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
	
	public boolean pickUp(){
	
		if(!left.pickUp())
			return false;
		
		if(!right.pickUp()){
			left.putDown();
			return false;
		}
		
		return true;
		
	}
	
	
	public void putDown(){
		left.putDown();
		right.putDown();
	}
	
	
	@Override
	public void run() {
		eat();
	}

}
