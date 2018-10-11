package generics;

public interface TreeNodeInterface<K> {
	
	public void insert(K key);
	public boolean search(K key);
	public K min();
	public K max();
	public K successor(K key);
	public K predecessor(K key);
	public void delete(K key);
}	
