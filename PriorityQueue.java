/** Implement the priority queue data structure using a single linked chain
	@author Elshaday Assefa
	@version 1.0
	*/
	
	import java.lang;
	
	public class PriorityQueue<T extends Comparable<T>> implements PriorityQueueInterface<T>  {
		private Node<T> head;
		private int size = 0;
		
		public PriorityQueue ( Node<T> head, int size) {
			this.head = head;
			this.size = size;
		}
		
		public void add(T newEntry) {
			// the node with the highest priority will be at the front of the queue ie min data
			Node<T> node = new Node<T>(newEntry);
			
			if (head == null) {
				head = node;
			} else {
				T tempData = head.next.data;// created temp variable to hold data from head.next
				if (node.data.compareTo(tempData) > 0) { // node.data > tempData
					head = head.next; // switch and link
					head.next = node;
				} else {
					head = node;
				}
			
			}
			size++; // increase size of linked list
		}
		
		public T remove() {
			if (head == null) {
				throw new NoSuchElementException();// the queue is empty, throws exception
			} else {
				T data = head.data;// removes node at top of the list(which has the highest priority)and returns the data
				head = head.next;
				size--; //decreases size of list
				return data;
			}
			
			
		}
		
		public T peek() {// return data of node at head of list
			T temp = head.data;
			return temp;
			
		}
		
		public boolean isEmpty() {// chacks if the Queue is empty
			if (head == null ) {
				return true;
			} else {
				return false
			}
			
		}
		
		public int getSize() {//returns size
			
			return size;
		}
		
		public void clear() {
			head = null;	 //dereferences the node from the linked list,
			head.data = null;	//garbage collector will come and collect it

		
			
		}
		
		
	}
	
	public class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> next;
		
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