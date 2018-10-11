package generics;

public class BinaryTree<K extends Comparable<K>> implements BinaryTreeInterface<K>{
	
	private TreeNode<K> root;
	private int height;
	private int size;
	
	public BinaryTree() {
		height = 0;
	}

	@Override
	public void insert(K key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public K search(K key) {
		if(root == null) {
			return null;
		}else {
			return root.search(root, key);
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
