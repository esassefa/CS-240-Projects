

private class StackLinkedData<T> implements StackInterface<T> {

private Node head;
private int data;

	private class node{
	private T item;
	private Node next;
	}

	public LinkedStack() {
		
		head = null;
		data = 0;
	}
	
	public T pop() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		T item = head.item;			// save item to return
		head = head.next;			// delete first node
		data--;
		return item;				// return saved item
		
	}
	
	public void push(T item) {			// add item to stack
		Node prevHead = head;
		head = new Node();
		head.item = item;
		head.next = prevHead;
		data++
	
		
	}
	
	public T peek() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		return head.data;
		
	}
	public boolean isEmpty() {
		return head == null;
	}
	
	public void clear() {
		head = null;
		return;
	}

}