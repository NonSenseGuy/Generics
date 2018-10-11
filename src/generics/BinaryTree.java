package generics;

public class BinaryTree<K extends Comparable<K>> implements BinaryTreeInterface<K>{
	
	private TreeNode<K> root;
	private int size;
	
	public BinaryTree() {
		size = 0;
	}
	
	public TreeNode<K> getRoot(){
		return this.root;
	}
	
	public int size() {
		return size;
	}

	@Override
	public void insert(K key) {
		TreeNode<K> node = new TreeNode<K>(key);
		if(root == null) {
			this.root = node;
			size++;
		}else {
			insert(root, node);
		}
		
	}
	
	private void insert(TreeNode<K> current, TreeNode<K> newNode) {
		int compare = current.compareTo(newNode.get());
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
	public K search(K key) {
		if(root == null) {
			return null;
		}else {
			return search(root, key);
		}
	}
	
	private K search(TreeNode<K> node, K key) {
		if(node == null || node.compareTo(key) == 0){
			return node.get();
		}else {
			if(node.compareTo(key) < 0) {
				return search(node.getRight(), key);
			}else {
				return search(node.getLeft(), key);
			}
		}
	}

	@Override
	public K min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K successor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K predecessor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
