package generics;

import java.util.ArrayList;
//Hash table class using chaining
public class HashTable<K,T> implements HashTableInterface<K,T>{
	
	//Current size of the table
	private int size;
	//Used to store array of chains
	private ArrayList<NodeKey<K,T>> table;
	//Current capacity of the table
	//Whenever size/tableCapacity > 0.7 
	//The current capacity will increase
	private int tableCapacity;
	
	//Constructor
	//Initialize capacity,size and empty chains
	public HashTable() {
		table = new ArrayList<>();
		size = 0;
		tableCapacity = 13;
		for (int i = 0; i< tableCapacity; i++) {
			table.add(null);
		}
	}
	// Hash function to find index for a key
	public int hashFunction(K key) {
		return Math.abs(key.hashCode())%tableCapacity;
	}
	//Adds a key value pair to hash
	@Override
	public void insert(K key,T element) {
		int index = hashFunction(key);
		NodeKey<K,T> head = table.get(index);
		
		//Check if key is already present
		while (head != null) {
			if(head.getKey().equals(key)) {
				head.setValue(element);
				return;
			}
			head = head.getNext();
		}
		
		//Insert key in chain
		size++;
		head = table.get(index);
		NodeKey<K,T> newNode = new NodeKey<K,T>(key, element);
		newNode.setNext(head);
		table.set(index, newNode);
		if((1.0*size)/tableCapacity >= 0.7) {
			ArrayList<NodeKey<K,T>> temp = table;
			table = new ArrayList<>();
			tableCapacity = tableCapacity*2;
			size = 0;
			for(int i = 0; i < tableCapacity; i++) {
				table.add(null);
			}
			for(NodeKey<K,T> headNode : temp) {
				while(headNode != null) {
					insert(headNode.getKey(), headNode.getValue());
					headNode = headNode.getNext();
				}
			}
		}
	}

	@Override
	public T delete(K key) {
		// apply hash function to get the position of the given key
		int index = hashFunction(key);
		// Get head of chain
		NodeKey<K,T> head = table.get(index);
		
		//Search for key in its chain 
		NodeKey<K,T> prev = null;
		while(head != null) {
			//if key found
			if(head.getKey().equals(key)) {
				break;
			}
			
			prev = head;
			head = head.getNext();
		}
		
		if(head == null) {
			return null;
		}
		
		size--;
		
		if(prev != null) {
			prev.setNext(head.getNext());
		}else {
			table.set(index, head.getNext());
		}
		
		return head.getValue();
	}

	@Override
	public T search(K key) {
		//find head of chain for given key
		int index = hashFunction(key);
		NodeKey<K,T> head = table.get(index);
		
		while(head != null) {
			if(head.getKey().equals(key)) {
				return head.getValue();
			}
			head = head.getNext();
		}
		return null;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

}
