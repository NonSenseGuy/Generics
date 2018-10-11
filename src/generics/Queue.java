package generics;

public class Queue<V> implements QueueInterface<V> {
	
	private Node<V> first;
	private Node<V> last;
	private int size;
	
	public Queue() {
		size = 0;
	}

	@Override
	public V dequeue() {
		if(size != 0) {
			Node<V> temp = first;
			first = first.getNext();
			size--;
			return temp.getValue();	
		}
		return null;
	}

	@Override
	public void enqueue(V value) {
		Node<V> temp = new Node<V>(value);
		if(size != 0) {
			last.setNext(temp);
			last = temp;
			size++;
		}else {
			first = temp;
			last = first;
			size++;
		}
		
	}

	@Override
	public V peek() {
		if(size != 0) return first.getValue();
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int search(V value) {
		if(size != 0) {
			int i = 0;
			Node<V> temp = first;
			if(temp.getValue().equals(value)) {
				return i;
			}else {
				while(temp.getNext() != null) {
					if(temp.getValue().equals(value)) {
						return i;
					}
					temp = temp.getNext();
					i++;
					
				}
			}
		}
		return -1;
	}

}
