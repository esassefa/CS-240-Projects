
/** 	A class implementing an ADT QUEUE using a double linked node
	@author Elshaday Assefa
	@version 1.0
	*/
	
public class DLDeque<T> implements DequeInterface<T> {
	private DLNode<T> head;			// pointer to beginning of line
	private DLNode<T> tail;			//pointer to end of line
	
	public DLDeque () 
	{
		head = null;
		tail = null;
		
		
		
	}
	
	public DLDeque (first person/ thing in line) 
	{
		// Fill in later
		
		
		
	}
	public void addToFront(T newEntry){
	
		if (newEntry == null) {
			throw new NullPointerException("The item you are trying to add is null");
		}
		DLNode<T> nd = new DLNode<T>(newEntry, head, null);
		if (head!= null) {
			head.setPrev(nd);
		}
		if(tail == null) {
			tail = nd;
		}
		head = nd;
		
		
		//create new node
		//set it to the front of the line
		//fix all pointers
		
		
	}
	public void addToBack(T newEntry) {
	
		if (newEntry == null) {
			throw new NullPointerException(" The item you are trying to add is null");		
		}
		DLNode<T> nd = new DLNode<T>(newEntry, null, tail);	//create a new node
		if (tail != null) {							//set it to the back of the line
			tail.setNext(nd);
		}
		if (head == null) {							// fix all pointers
			head = nd;
		}
		tail = nd;								//set it to the back of the line 
		
		
		
		//set it to the back of the line
		
	}
	public T removeFront() {
	
		if (head == null) {
			throw new NoSuchElementException(" empty deque");
			
		}
		DLNode<T> temp = head ;
		head = head.getNext();
		head.setPrev(null);
		return temp.getData();
		
		// check if data is there if NOT throw exception
		// hold data in temp variable
		// delete data in DLNode (for security) 
		// move head to next
		// ONLY IF there is a DLNode that head is pointing to then move its prev to null
		
	}
	
	public T removeBack() {
	if (head == null) {
		throw new NoSuchElementException("empty deque");
	}
	
	
	DLNode temp2 = tail;
	tail = tail.getPrev();
	tail.setNext(null);
	return temp2.getData();
	
	
	
	// check if data is there  if not throw exception
	//hold data in temp variable
	//delete data in DLNode (for security)
	//move tail to previous 
	//ONLY IF THERE IS A DLNode that TAIL is pointing to then move its previous to NEXT
	}
	
	public T getFront() {
		return head.getData();
		
		
	}
	public T getBack () {
	
		
		return tail.getData();
		
	}
	


public class DLNode {
	
	private DLNode<T> prev;
	private DLNode<T> next;
	private T data;
	
	public DLNode(T data, Node<T> next, Node<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
		
	}
	public DLNode<T> getPrev() {
		return prev;
		
	}
	public void setPrev(DLNode<T> prev) {
		this.prev = prev;
	
	}
	public DLNode<T> getNext() {
		return next;
	}
	
	public void setNext(DLNode<T> next) {
		this.next = next;
		
	}
	public T getData() {
		return value;
	}
	public void setData(T data) {
		this.data = data;
	}
}
	
}
			

	
	
	
	
