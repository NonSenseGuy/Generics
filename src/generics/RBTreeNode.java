package generics;

public class RBTreeNode<K extends Comparable<K>,V> extends TreeNode<K,V>{
	public final boolean RED = true;
	public final boolean BLACK = false;
	
	
	private boolean color;
	
	public RBTreeNode(K key, V value) {
		super(key, value);
	}
	
	public RBTreeNode(K key, V value, boolean color) {
		super(key,value);
		this.color = color;
	}
	

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}
	
	
}
