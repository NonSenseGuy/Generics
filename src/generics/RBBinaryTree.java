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
		if(node != null) {
			while(node.getLeft() != null) {
				node = node.getLeft();
			}
			return node;
		}
		return null;
	}

	@Override
	public TreeNode<K, V> max(TreeNode<K, V> node) {
		if(node != null) {
			while(node.getRight() != null) {
				node = node.getRight();
			}
			return node;
		}
		return null;
	}

	@Override
	public TreeNode<K,V> successor(K key) {
		if(root != null) {
			return successor(search(key));
		}
		return null;
	}

	
	private TreeNode<K,V> successor(TreeNode<K,V> node) {
		if(node.getRight() != null) {
			return min(node.getRight());
		}
		TreeNode<K,V> y = node.getParent();
		while(y != null && node == y.getRight()) {
			node = y;
			y = y.getParent();
		}
		return y;
	}

	@Override
	public TreeNode<K,V> predecessor(K key) {
		if(root != null) {
			return predecessor(search(key));
		}
		return null;
	}
	
	private TreeNode<K,V> predecessor(TreeNode<K,V> node) {
		if(node.getLeft() != null) {
			return max(node.getLeft());
		}
		TreeNode<K,V> y = node.getParent();
		while(y != null && node == y.getLeft()) {
			node = y;
			y = y.getParent();
		}
		return y;
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}
	
	
}
