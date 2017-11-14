/** Implements the List Data Structure using Linked Lists(nodes)
	@author Elshaday Assefa
	@version 1.0
	*/
	
	public class DLList<T> implements ADTListInterface<T> {
		
		private DLNode<T> firstNode;
		private DLNode<T> lastNode;
		private int numberOfEntries = 0;
		
		public DLList(DLNode<T> head, DLNode<T> tail, int numberOfEntries) {
			initializeDataFields();
		}
		
		public void clear() {
			initializeDataFields();
		}
		
		public void addToFront(T newEntry) {
			DLNode<T> node = new DLNode<T>(newEntry);
			if(firstNode == null ) {
			firstNode = node;
			} else {
				node.next = firstNode;
				firstNode = node;
				
				
				
			}
			numberOfEntries++;
		}
		
		public void addToBack(T newEntry) {
			DLNode<T> node = new DLNode<T>(newEntry);
			if(firstNode == null) {
				firstNode = node;
				lastNode = firstNode;
			} else {
				node.prev = lastNode;
				lastNode = node;
			}
			numberOfEntries++;
		}
		
		public void add(int position, T newEntry) {
			DLNode<T> newNode = new DLNode<T>(newEntry);
			DLNode<T> nodeBefore = getNodeAt( position - 1);
			DLNode<T> nodeAfter = nodeBefore.getNext();
			newNode.setNext(nodeAfter);
			nodeBefore.setNext(newNode);
			numberOfEntries++;
		}
		
		public T removeFromFront() {
			DLNode<T> node = firstNode;
			T temp = node.data;
			firstNode = firstNode.next;
			return temp;
			numberOfEntries--;
		}
		
		public T removeFromBack() {
			DLNode<T> node = lastNode;
				T temp = node.data;
				lastNode = lastNode.prev;
			numberOfEntries--;
		}
		public T remove(int position) {
			DLNode<T> node = getNodeAt(position);// find node at given position
			T temp = node.getData();// hold data in temp variable
			DLNode<T> nodeBefore = getNodeAt(position - 1);// dereference node at given position 
			DLNode<T> nodeAfter = getNodeAt(position + 1);
			nodeBefore.next = nodeAfter;
			
			return temp; //return data in temp variable
			numberOfEntries--;
		}
		
		
		
		public boolean isEmpty() {
			if(firstNode = null) {
				return true;
			} else {
				return false;
			}
		}
		
		public T getEntry( int position) {
			DLNode<T> currentNode = firstNode;
			if ((position >= 1 ) && (position<= numberOfEntries)) {
				for(int counter = 1; counter < position; counter++) {
					currentNode = currentNode.getNext();
				}
				
			}
			T temp = currentNode.getData();
			return temp;
		}
		
		private DLNode<T> getNodeAt(int position) {
			
			assert (firstNode != null) && (1<= givenPosition) && (givenPosition <= numberOfEntries);
			DLNode<T> currentNode = firstNode;
			
			for (int counter = 1; counter < position; counter++) {
				currentNode = currentNode.getNext();
			}
			assert currentNode != null;
			return currentNode;
			
		}
		
		private void initializeDataFields() {
			head = null;
			numberOfEntries = 0;
		}
		
		
		
		
		
		private class DLNode<T> {
			DLNode<T> next;
			DLNode<T> prev;
			T data;
			
			public DLNode(DLNode<T> next, DLNode prev, T data) {
				this.next = next;
				this.prev = prev;
				this.data = data;
			}
			
			public void setNext(DLNode<T> next) {
				this.next = next;
			}
			
			public DLNode<T> getNext() {
				return next;
				
			}
			
			public void setPrev(DLNode<T> prev) {
				this.prev = prev;
			}
			
			public DLNode<T>  getPrev() {
				return prev;
				
			}
			
			public void setData(T data) {
				this.data = data;
	
			}
			
			public T getData() {
				return data;
			}
		}
	}