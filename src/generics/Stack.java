package generics;

import java.util.EmptyStackException;

public class Stack<V> implements StackInterface<V> {
	
	private int size;
	private Node<V> top;
	
	public Stack() {
		size = 0;
	}

	@Override
	public V top() {
		if(top != null) return top.getValue();
		return null;
	}

	@Override
	public V pop() {
		if(size != 0) {
			Node<V> temp = top;
			top = top.getNext();
			size--;
			return temp.getValue();
		}
		throw new EmptyStackException();
	}

	@Override
	public void push(V element) {
		if(size != 0) {
			Node<V> temp = new Node<V>(element);
			temp.setNext(top);
			top = temp;
			size++;
		}else {
			top = new Node<V>(element);
			size++;
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int search(V element) {
		if(size != 0) {
			int i = 0;
			Node<V> temp = top;
			if(temp.getValue().equals(element)) {
				return i;
			}else {
				while(temp.getNext() != null) {
					if(temp.getValue().equals(element)) {
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
