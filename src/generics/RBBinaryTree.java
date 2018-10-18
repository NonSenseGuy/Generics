package generics;

public class RBBinaryTree<K extends Comparable<K>, V> implements BinaryTreeInterface<K,V>{
	
	private RBTreeNode<K,V> root;
	private long size;
	
	public RBBinaryTree() {
		size = 0;
		root = null;
	}
	
	public RBTreeNode<K,V> getRoot(){
		return root;
	}
	
	public void setRoot(RBTreeNode<K,V> root ) {
		this.root = root;
	}
	
	public long size() {
		return size;
	}
	

	@Override
	public void insert(K key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TreeNode<K, V> search(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<K, V> min(TreeNode<K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<K, V> max(TreeNode<K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<K, V> successor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode<K, V> predecessor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}
	
	
}
