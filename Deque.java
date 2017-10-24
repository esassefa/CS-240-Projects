/** 	A class implementing a double ended queue using linked node
	@author Elshaday Assefa
	@version 1.0
*/

public class Deque<T> implements DequeInterface<T> {
	private Node<T> head;
	private Node<T> tail;
	
	
	public Deque<T>() {
		head = null;
		tail = null;
		
	}
	
	public void addToFront( T newEntry) {
		if (newEntry == null){
			throw NullPointerException("Entry is null/ empty"); //checks if there is data in the item
		}
		Node<T> nd = new Node<T>(head, newEntry);
		if (head != null){
			nd.setNext(head);
		}
		if (tail == null) {
			tail = nd;
		}
		head = nd;
	}
	public void addToBack( T newEntry) {
		if(newEntry = null) {
			throw NullPointerException("Entry is null/empty");
		}
		Node<T> nd = new Node<T>(null, newEntry);
		if(tail != null){
			tail.setNext(nd);
		}
		if (head == null) {
			head = nd;
		}
		tail = nd;
		
	}
	public T removeFront() {
		if (head == null) {
			throw NoSuchElementException("the deque is empty");
		}
		Node<T> temp = head;
		if (head == tail) {
			head = null;
			tail = null;
		}
		else {
			head = head.getNext();
			
		}
		return temp.getData();
		
		
	}
	public T removeBack() {
		if (head = null) {
			throw NoSuchElementException("the deque is empty");
		}
		Node<T> temp2 = tail;
		if (head == tail) {
			head = null;
			tail = null;
		}
		else {
			while // i think this part is easier in doubly linked node, i dont know how to do this part
	}
	return temp.getData();
	}
	public T getFront() {
		return head.getData();
		
	}
	public T getBack() {
		return tail.getData();
	}

	
	public class Node<T> {
		private Node<T> next;
		private T data;
		
		public Node(Node<T> next, T data) {
			this.next = next;
			this.data = data;
			
		}
		
		public void setNext(Node<T> next) {
			
			this.next = next;
			
		}
		public Node<T> getNext() {
			
			return next;
		}
		
		public void setData(T data) {
			this.data = data;
		}
		
		public T getData() {
			
			return data;
		}
		
	}
	
}