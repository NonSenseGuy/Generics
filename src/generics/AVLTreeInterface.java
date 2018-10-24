package generics;

public interface AVLTreeInterface<K extends Comparable<K>, V> {
	
	public void insert(K key, V value);
	public AVLTreeNode<K,V> delete(K key);
	public AVLTreeNode<K,V> search(K key);
	public void leftRotate(AVLTreeNode<K,V> node);
	public void rightRotate(AVLTreeNode<K,V> node);
	public void rebalance(AVLTreeNode<K,V> node);
	public AVLTreeNode<K,V> successor(K key);
	public AVLTreeNode<K,V> predecessor(K key);
	public AVLTreeNode<K,V> min(AVLTreeNode<K,V> node);
	public AVLTreeNode<K,V> max(AVLTreeNode<K,V> node);
}
