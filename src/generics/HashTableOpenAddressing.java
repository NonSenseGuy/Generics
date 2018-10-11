package generics;
import java.util.ArrayList;

public class HashTableOpenAddressing<K,T> implements HashTableInterface<K,T>  {
	
	private ArrayList<NodeKey<K,T>> openTable;
	private	int tableCapacity;
	private int size;
	private NodeKey<K,T> dummy;
	
	public HashTableOpenAddressing() {
		tableCapacity = 11;
		size = 0;
		openTable = new ArrayList<>();
		for(int i = 0; i < tableCapacity; i++) {
			openTable.add(null);
		}
		
		dummy = new NodeKey<K,T>(null, null);
	}
	//Hash function
	public int hash(K key) {
		return Math.abs(key.hashCode()) % tableCapacity;
	}
	//Inserts an element to the hash table, avoids collisions using linear probing
	@Override
	public void insert(K key, T element) {
		NodeKey<K,T> temp = new NodeKey<K,T>(key,element);
		int hashIndex = hash(key);
		
		while(openTable.get(hashIndex) != null && !openTable.get(hashIndex).equals(key)) {
			hashIndex++;
			hashIndex%=tableCapacity;
		}
		
		if(openTable.get(hashIndex) == null || openTable.get(hashIndex).getKey() == dummy) {
			openTable.set(hashIndex, temp);
			size++;
		}
	}
	// Deletes an item of the hashTable 
	@Override
	public T delete(K key) {
		int hashIndex = hash(key);
		while(openTable.get(hashIndex) != null) {
			if(openTable.get(hashIndex).getKey().equals(key)) {
				NodeKey<K,T> temp = openTable.get(hashIndex);
				openTable.set(hashIndex, dummy);
				size--;
				return temp.getValue();
			}
			
			hashIndex++;
			hashIndex %= tableCapacity;
		}
		return null;
	}
	//gets a value by searching with a key in the hash table 
	@Override
	public T search(K key) {
		int hashIndex = hash(key);
		while(openTable.get(hashIndex) != null) {
			if(openTable.get(hashIndex).getKey().equals(key)) {
				return openTable.get(hashIndex).getValue();
			}
			hashIndex++;
			hashIndex%=tableCapacity;
		}
		return null;
	}
	//get amounts of elements inserted in the hash table
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

}
