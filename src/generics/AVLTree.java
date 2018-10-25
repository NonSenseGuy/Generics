package generics;

import com.aed.lab3.generic.TreeNode;

public class AVLTree<K extends Comparable<K>,V> implements AVLTreeInterface<K,V> {
	
	private AVLTreeNode<K,V> root;
	
	public AVLTree() {
		root = null;
	}
	
	public int height(AVLTreeNode<K,V> n) {
		if(n != null) {
			return n.getHeight();
		}
		return 0;
	}
	
	public int max(int a, int b) {
		return (a>b) ? a:b;
	}
	
	
	public AVLTreeNode<K, V> getRoot() {
		return root;
	}
	
	public void setRoot(AVLTreeNode<K, V> root) {
		this.root = root;
	}

	@Override
	public void insert(K key, V value) {
		TreeNode<K,V> node = new TreeNode<K,V>(key, value);
		TreeNode<K,V> aux;
		if(root == null) {
			this.root = node;
		}else if((aux = search(key)) != null){
			aux.getValue().add(value);
		}else {
			insert(root, node);
		}
	}
	
	private void insert(AVLTreeNode<K,V> node, AVLTreeNode<K,V> newNode){
		
	}
	
	@Override
	public AVLTreeNode<K, V> delete(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AVLTreeNode<K, V> search(K key) {
		if(root != null) search(root, key);
		return null;
	}
	
	private AVLTreeNode<K,V> search(AVLTreeNode<K,V> x, K key){
		if(x == null || x.getKey().compareTo(key) == 0) {
			return x;
		}else {
			if(x.getKey().compareTo(key) < 0) {
				return search(x.getLeft(), key);
			}else {
				return search(x.getRight(), key);
			}
			
		}
	}
	@Override
	public void leftRotate(AVLTreeNode<K, V> x) {
		AVLTreeNode<K,V> y = x.getRight();
		x.setRight(y.getLeft());
		y.getLeft().setParent(x);
		y.setParent(x.getParent());
		if(x.getParent() == null) {
			root = y;
		}else {
			if(x == x.getParent().getLeft()) {
				x.getParent().setLeft(y);
			}else {
				x.getParent().setRight(y);
			}
		}
		y.setLeft(x);
		x.setParent(y);
	}
	@Override
	public void rightRotate(AVLTreeNode<K, V> x) {
		AVLTreeNode<K,V> y = x.getLeft();
		x.setLeft(y.getRight());
		y.getRight().setParent(x);
		y.setParent(x.getParent());
		if(x.getParent() == null) {
			root = y;
		}else {
			if(x == x.getParent().getRight()) {
				x.getParent().setRight(y);
			}else {
				x.getParent().setLeft(y);
			}
		}
		y.setRight(x);
		x.setParent(y);
	}
	
	public int getBalance() {
		return getBalance(root);
	}
	public int getBalance(AVLTreeNode<K,V> node) {
		if(node == null) {
			return 0;
		}
		return height(node.getLeft()) - height(node.getRight());
	}
	
	@Override
	public void rebalance(AVLTreeNode<K, V> node) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public AVLTreeNode<K, V> successor(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AVLTreeNode<K, V> predecessor(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AVLTreeNode<K, V> min(AVLTreeNode<K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AVLTreeNode<K, V> max(AVLTreeNode<K, V> node) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
