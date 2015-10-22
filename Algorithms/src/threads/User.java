package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class User {
    
	Lock lock;
	int balance=500;
	String name;
	
	public User(String name){
		lock=new ReentrantLock();
		this.name=name;
	}
	
    public  void withdraw(int value){
    	
    	lock.lock();
    	try {
			 Thread.sleep(2000);
    	     balance=balance-value;
    	     Thread.sleep(2000);
    	     System.out.println("Balance " + balance);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	lock.unlock();
    }
    
    public  void deposit(int value){
    	
    	lock.lock();
    	
    	try {
			 Thread.sleep(2000);
    	     balance=balance+value;
    	     Thread.sleep(2000);
    	     System.out.println("Balance " + balance);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	lock.unlock();
    }

}
