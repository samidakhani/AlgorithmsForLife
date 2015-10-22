package oops;

import java.util.LinkedList;

public class Hash<K, V> {

	private int MAX_SIZE=10;
	private LinkedList<Cell<K,V>>[] items=null;
	
	@SuppressWarnings("unchecked")
	public Hash() {
		items=(LinkedList<Cell<K,V>>[]) new LinkedList[MAX_SIZE];
	}
	
	public int hashCodeOfKey(K key){
		return key.toString().length() % items.length;
	}
	
	public void put(K k, V v){
	
		int x = hashCodeOfKey(k);
		if(items[x] == null){
			items[x]=new LinkedList<Cell<K,V>>();
		}
		
		LinkedList<Cell<K,V>> collision=items[x];
		
		for (Cell<K, V> cell : collision) {
			if(cell.equivalent(k)){
				collision.remove(cell);
				break;
			}
		}
		
		Cell<K,V> cell=new Cell<K,V>(k,v);
		collision.add(cell);
	}
	
	public V get(K k){
		
		int x = hashCodeOfKey(k);
		if(items[x] == null){
			return null;
		}
		
		LinkedList<Cell<K,V>> collision=items[x];
		
		V value=null;
		
		for (Cell<K, V> cell : collision) {
			if(cell.equivalent(k)){
				value=cell.getValue();
			}
		}
		
		return value;
	}
}
