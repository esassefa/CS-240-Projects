@author Elshaday Assefa

public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] array;
	private int size = 0;
	private int front = 0;
	private int back = 0;
	public static final int DEFAULT_CAPACITY = 10;
	

	public ArrayQueue(){
		
		array = new T(DEFAULT_CAPACITY);
		
	}
	
	
	public void enqueue (T newEntry) {
	if(array.length == size){
		System.out.print( "Queue is full");
	}
	else {
		array[back] = newEntry;
	}
		back = (back + 1) % array.length;
		size++;
	
		
	}
	
	public T dequeue() {
		if (size == 0) 
			throw new EmptyQueueException("The Queue is empty.");
		T newEntry = array[front];
		array[front] = null;
		front = (front + 1) % array.length;
		size--;
		return newEntry;

		
		
	}
	
	public T getFront() {
		if (size == 0) {
			throw new EmptyQueueException("You cannot peek/ look into an empty Queue");
		}
		return array[size -1];
		
		
	}
	
	public boolean isEmpty() {
		
		return size == 0;
		
		
	}
	
	public void clear() {
		
		return size = 0;
		
	}
	
	

}