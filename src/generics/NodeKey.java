package generics;

public class NodeKey<K,V> {
	
	private K key;
	private V value;
	private NodeKey<K,V> next;
	
	public NodeKey(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public NodeKey<K, V> getNext() {
		return next;
	}

	public void setNext(NodeKey<K, V> next) {
		this.next = next;
	}
	
	
}
