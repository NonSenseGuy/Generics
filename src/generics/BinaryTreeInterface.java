package generics;

import javafx.util.Pair;

public interface BinaryTreeInterface<K extends Comparable<K>, V> {
	
	public void insert(K key, V value);
	public Pair<K,V> search(K key);
	public Pair<K,V> min(TreeNode<K,V> node);
	public Pair<K,V> max(TreeNode<K,V> node);
	public Pair<K,V> successor(K key);
	public Pair<K,V> predecessor(K key);
	public void delete(K key);
	
	
}
