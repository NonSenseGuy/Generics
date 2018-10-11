package generics;

public interface HashTableInterface<K,T> {
	
	public void insert(K key, T element);
	public T delete(K key);
	public T search(K key);
	public int size();
	public boolean isEmpty();
	
	

	
	

}
