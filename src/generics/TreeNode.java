package generics;

public class TreeNode<K extends Comparable<K>> implements Comparable<K>{
	
	private K key;
	private TreeNode<K> right;
	private TreeNode<K> left;
	
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

	public K search(TreeNode<K> node, K key) {
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

	@Override
	public int compareTo(K o) {
		return key.compareTo(o);
	}


	
	
}
