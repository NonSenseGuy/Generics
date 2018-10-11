package generics;

public interface LinkedListInterface<T> {
	public boolean add(T element);
	public boolean remove(int pos);
	public T remove(T element);
	public int size();
	public boolean isElementInList(T element);
	public int get(T element);
	public T get(int pos);
	public boolean isEmpty();
	public void deleteAll();
	public int indexOf(T element);
}
