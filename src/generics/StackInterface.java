package generics;

public interface StackInterface<T> {
	
	public T top();
	public T pop();
	public void push(T element);
	public boolean isEmpty();
	public int search(T element);
}
