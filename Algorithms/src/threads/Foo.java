package threads;

import java.util.concurrent.Semaphore;

public class Foo {
	
	Semaphore sem1;
	Semaphore sem2;
	
	public Foo() throws InterruptedException{
		
		sem1=new Semaphore(1);
		sem2=new Semaphore(1);
		
		sem1.acquire();
		sem2.acquire();
	}
	
	public void first(){
		
		System.out.println("Method 1");
		sem1.release();
	}
	
	public void second() throws InterruptedException{
		
		sem1.acquire();
		sem1.release();
		System.out.println("Method 2");
		sem2.release();
	}
	
	public void third() throws InterruptedException{
		sem2.acquire();
		sem2.release();
		System.out.println("Method 3");
		
	}

}
