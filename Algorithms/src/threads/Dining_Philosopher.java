package threads;

public class Dining_Philosopher {

	public static void main(String[] args) {
		
		Chopstick chop1=new Chopstick();
		Chopstick chop2=new Chopstick();
		Chopstick chop3=new Chopstick();
		Chopstick chop4=new Chopstick();
		
		Philosopher philosopher1=new Philosopher("Philosopher 1", chop1, chop2);
		Philosopher philosopher2=new Philosopher("Philosopher 2", chop2, chop3);
		Philosopher philosopher3=new Philosopher("Philosopher 3", chop3, chop4);
		
		
		philosopher1.start();
		philosopher2.start();
		philosopher3.start();

	}

}
