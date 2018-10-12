package generics;

import javafx.util.Pair;

public class BinaryTree<K extends Comparable<K>, V> implements BinaryTreeInterface<K,V>{
	
	private TreeNode<K,V> root;
	private int size;
	
	public BinaryTree() {
		size = 0;
	}
	
	public TreeNode<K,V> getRoot(){
		return this.root;
	}
	
	public int size() {
		return size;
	}

	@Override
	public void insert(K key, V value) {
		TreeNode<K,V> node = new TreeNode<K,V>(key, value);
		if(root == null) {
			this.root = node;
			size++;
		}else {
			insert(root, node);
		}
		
	}
	
	private void insert(TreeNode<K,V> current, TreeNode<K,V> newNode) {
		int compare = current.compareTo(newNode.getKey());
		//if the new node is greater than current 
		if(compare < 0) {
			//if the left child of current is null, the new node is inserted there
			if(current.getRight() == null) {
				current.setRight(newNode);
				newNode.setParent(current);
				size++;
				return;
			//else keep evauali
			}else {
				insert(current.getRight(), newNode);
			}
		}else {
			if(current.getLeft() == null) {
				current.setLeft(newNode);
				newNode.setParent(current);
				size++;
				return;
			}else {
				insert(current.getLeft(), newNode);
			}
		}
	}

	@Override
	public TreeNode<K,V> search(K key) {
		if(root == null) {
			return null;
		}else {
			return search(root, key);
		}
	}
	
	private TreeNode<K,V> search(TreeNode<K,V> node, K key) {
		if(node == null || node.compareTo(key) == 0){
			return node;
		}else {
			if(node.compareTo(key) < 0) {
				return search(node.getRight(), key);
			}else {
				return search(node.getLeft(), key);
			}
		}
	}
	//Returns the minimum key in the tree
	@Override
	public Pair<K,V> min(TreeNode<K,V> node) {
		if(node != null) {
			while(node.getLeft() != null) {
				node = node.getLeft();
			}
			return new Pair<K,V>(node.getKey(), node.getValue());
		}
		return null;
	}
	//Returns the maximum key in the tree
	@Override
	public Pair<K,V> max(TreeNode<K,V> node) {
		if(node != null) {
			while(node.getRight() != null) {
				node = node.getRight();
			}
			return new Pair<K,V>(node.getKey(), node.getValue());
		}
		return null;
	}
	
	@Override
	public Pair<K,V> successor(K key) {
		if(root != null) {
			successor(search(key));
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
	public Pair<K,V> predecessor(K key) {
		if(root != null) {
			return predecessor(search(key));
		}
		return null;
	}
	
	private Pair<K,V> predecessor(TreeNode<K,V> node) {
		if(node.getLeft() != null) {
			return max(node.getLeft());
		}
		TreeNode<K,V> y = node.getParent();
		while(y != null && node == y.getLeft()) {
			node = y;
			y = y.getParent();
		}
		return new Pair(y.getKey(), y.getValue());
	}
	

	@Override
	public void delete(K key) {
		if(root != null) {
			delete(search(key));
		}
		return null;
	}
	
	private void delete(TreeNode<K,V>) {
		
	}

	
	
	
	
}
