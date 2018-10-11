package generics;


public class LinkedList<T> implements LinkedListInterface<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	
	public LinkedList() {
		size = 0;
	}

	@Override
	public boolean add(T element) {
		Node<T> node = new Node<T>(element);
		if(first == null) {
			first = node;
			last = node;
			size++;
		}else {
			last.setNext(node);
			last = node;
			size++;
		}
		return true;
	}

	@Override
	public boolean remove(int pos) {
		if(pos == 0) {
			deleteFirstNode();
			return true;
		}else if (pos > 0 && pos < size - 1) {
			deleteBetweenNode(pos);
			return true;
		}else if( pos == size -1){
			deleteLast();
			return true;
		}

		return false;
	}

	private void deleteLast() {
		Node<T> lastNode = first;
		Node<T> before = null;
		while(lastNode.getNext() != null) {
			before = lastNode;
			lastNode = lastNode.getNext();
		}
		before.setNext(null);
		last = before;
		size--;
		
	}

	private void deleteBetweenNode(long pos) {
		Node<T> before = first;
		for(int i = 0; i < pos -1; i++) {
				before = before.getNext();
		}
		Node<T> temp = before.getNext();
		Node<T> after = temp.getNext();
		before.setNext(after);
		size--;
		
	}

	private void deleteFirstNode() {
		if(first != null) {
			Node<T> tmp = first;
			first = tmp.getNext();
			last = first == null ? null: last;
			size--;
		}
		
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isElementInList(T element) {
		return get(element) != -1 ? true : false;
	}

	@Override
	public int get(T element) {
		Node<T> temp = first;
		while(temp != null) {
			if(temp.getValue().equals(element)) {
				return indexOf(temp.getValue());
			}
			temp = temp.getNext();
		}
		return -1;
	}

	@Override
	public T get(int pos) {
		Node<T> temp = first;
		if(pos == 0) {
			return temp.getValue();
		}else if(pos > 0 && pos < size -1) {
			while(temp != null) {
				if(indexOf(temp.getValue()) == pos) return temp.getValue();
				temp = temp.getNext();
				
			}
		}else if (pos == -1) {
			return last.getValue();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(first == null) return true;
		return false;
	}

	@Override
	public void deleteAll() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public int indexOf(T element) {
		int index = 0;
		Node<T> temp = first;
		while(temp != null) {
			if(temp.getValue().equals(element)) {
				return index;
			}
			index++;
			temp = temp.getNext();
		}
		
		return -1;
	}

	@Override
	public T remove(T element) {
		int pos = get(element);
		if(pos != -1) {
			T result = get(pos);
			remove(pos);
			return result;
		}
		return null;
	}
}
