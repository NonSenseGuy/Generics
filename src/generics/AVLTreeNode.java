package generics;

import java.util.ArrayList;

public class AVLTreeNode<K extends Comparable<K>, V> implements Comparable<AVLTreeNode<K,V>> {
	
	private AVLTreeNode<K,V> left,right,parent;
	private int height;
	private K key;
	private ArrayList<V> value;
	
	public AVLTreeNode(K key, V value) {
		this.key = key;
		this.value = new ArrayList<>();
		this.value.add(value);
		height = 1;
	}
	
	
	
	public AVLTreeNode<K, V> getLeft() {
		return left;
	}

	public void setLeft(AVLTreeNode<K, V> left) {
		this.left = left;
	}

	public AVLTreeNode<K, V> getRight() {
		return right;
	}

	public void setRight(AVLTreeNode<K, V> right) {
		this.right = right;
	}

	public AVLTreeNode<K, V> getParent() {
		return parent;
	}

	public void setParent(AVLTreeNode<K, V> parent) {
		this.parent = parent;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public ArrayList<V> getValue() {
		return value;
	}

	public void setValue(ArrayList<V> value) {
		this.value = value;
	}

	@Override
	public int compareTo(AVLTreeNode<K, V> o) {
		return key.compareTo(o.getKey());
	}


	
}
