package generics;

public class TreeNode<K extends Comparable<K>> implements Comparable<K>{
	
	private K key;
	private TreeNode<K> right;
	private TreeNode<K> left;
	private TreeNode<K> parent;
	

	public TreeNode(K value) {
		this.key = value;
	}
	
	public K get() {
		return key;
	}
	
	public void set(K value) {
		this.key = value;
	}

	public TreeNode<K> getRight() {
		return right;
	}

	public void setRight(TreeNode<K> right) {
		this.right = right;
	}

	public TreeNode<K> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<K> left) {
		this.left = left;
	}
	public TreeNode<K> getParent() {
		return parent;
	}

	public void setParent(TreeNode<K> parent) {
		this.parent = parent;
	}

	public K search(K key) {
		if(node == null) {
			return null;
		}else if(node.get().equals(key)) {
			return node.get();
		}else {
			if(node.compareTo(key) < 0) {
				return search(node.right, key);
			}else {
				return search(node.left, key);
			}
			
		}
	}
	
	public void insert(TreeNode<K> current, TreeNode<K> newNode) {
		int compare = current.compareTo(newNode.get());
		if(compare < 0) {
			if(current.right == null) {
				current.right = newNode;
				
			}
		}
	}

	@Override
	public int compareTo(K o) {
		return key.compareTo(o);
	}


	
	
}
