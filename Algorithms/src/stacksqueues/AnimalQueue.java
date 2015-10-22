package stacksqueues;

/*public class Animal{
	private int order;
	private String name;
	
	public Animal(String n){
		name=n;
	}
	
	public void setOrder(int order){
		this.order=order;
	}
	
	public int getOrder(){
		return this.order;
	}
	
	public boolean isOlderThan(Animal a){
		if(this.order < a.order) return true;
		return false;
	}
}

public class Dog extends Animal {
	
	public Dog(String n){
		super(n);
	}
	
}

public class Cat extends Animal {
	
	public Cat(String n){
		super(n);
	}
	
}
*/
public class AnimalQueue {

/*	LinkedList<Dog> dogs=new LinkedList<Dog>();
	LinkedList<Cat> cats=new LinkedList<Cat>();
	private int order=0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog) dogs.addLast((Dog)a);
		else cats.addLast((Cat)a);
		
	}
	
	
	public Dog dequeueDog(){
		return dogs.poll();
	}
	
	public Cat dequeueCat(){
		return cats.poll();
	}
	
	public Animal dequeueAny(){
		
		if(dogs.isEmpty())  return dequeueCat();
		if(cats.isEmpty())   return dequeueDog();
		
		if(dogs.peek().isOlderThan(cats.peek())) return  dequeueDog();
		else return dequeueCat();
	}*/
	
}
