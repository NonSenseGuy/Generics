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
		RBTreeNode<K,V> node = new RBTreeNode<K,V>(key,value);
		if(root == null) {
			node.setColor(false);
			root = node;
		}else {
			insert(root, node);
		}
		
		
	}
	
	private void insert(RBTreeNode<K,V> current, RBTreeNode<K,V> newNode) {
		
	}

	@Override
	public TreeNode<K, V> search(K key) {
		if(root != null) {
			return search(root, key);
		}return null;
	}
	
	private TreeNode<K,V> search(RBTreeNode<K,V> current, K key){
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
