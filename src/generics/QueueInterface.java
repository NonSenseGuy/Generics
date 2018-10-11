package generics;

public interface QueueInterface<T> {
	public T dequeue();
	public void enqueue(T value);
	public T peek();
	public boolean isEmpty();
	public int search(T value);
}
