package oops;

public class Cell<K,V> {
    private K key;
    private V value;
    
    public Cell(K k,V v){
    	key=k;
    	value=v;
    }
    
    public K getKey(){
    	return key;
    }
    
    public V getValue(){
    	return value;
    }
    
    public boolean equivalent(K k){
    	return key.equals(k);
    }
}
