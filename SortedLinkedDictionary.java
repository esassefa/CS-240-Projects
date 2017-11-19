/** implementation of the dictionary using linkedList
	@author Elshaday Assefa
	@version 1.0
	*/
	
	public class SortedLinkedDictionary<K extends Comparable<? super K>, V> implements DictionaryInterface<K,V> {
		
	private Node firstNode;
	private int numberOfEntries;

	
	public SortedLinkedList() (
		initializeDataFields();
	)
	
   /** Adds a new entry to this dictionary. If the given search key already
       exists in the dictionary, replaces the corresponding value.
       @param key    An object search key of the new entry.
       @param value  An object associated with the search key.
       @return  Either null if the new entry was added to the dictionary
                or the value that was associated with key if that value
                was replaced. */
   public V add(K key, V value) {
	   V result = null;
	   
	   Node<T> currentNode = firstNode;
	   Node<T> nodeBefore = null;
	   while ((currentNode !=null) && key.compareTo(currentNode.getKey()) > 0) {
		   nodeBefore = currentNode;
		   currentNode = currentNode.getNextNode();
	   }
	   if((currentNode!= null) && key.equals(currentNode.getKey())) {
		   result = currentNode.getValue();
		   currentNode.setValue(value);
		   
	   }
	   else {
		   Node<T> newNode = new Node<T>(key, value);
		   if (nodeBefore == null) {
			   newNode.setNextNode(firstNode);
			   firstNode = newNode;
		   }
		   else {
			   newNode.setNextNode(currentNode);
			   nodeBefore.setNextNode(newNode);
		   }
		   nuberOfEntries++;
	   }
	   
	   return result;
   }
   
   /** Removes a specific entry from this dictionary.
       @param key  An object search key of the entry to be removed.
       @return  Either the value that was associated with the search key
                or null if no such object exists. */
   public V remove(K key) {
	   V result = null;
	   Node<T> currentNode = firstNode;
	   Node<T> nodeBefore = null;
	   while((currentNode != null) && key.compareTo(currentNode.getKey()) > 0) {
		   nodeBefore = currentNode;
		   currentNode = currentNode.getNextNode();
	   }
	   if((currentNode != null) && key.equals(currentNode.getKey())) {
		   result = currentNode.getValue();
		   if(nodeBefore != null) {
			   nodeBefore.setNextNode(currentNode.getNextNode());
		   }
		   else {
			  firstNode = currentNode.getNextNode(); 
		   }
		   numberOfEntries--;
	   }
	   return result;
   }
   
   /** Retrieves from this dictionary the value associated with a given
       search key.
       @param key  An object search key of the entry to be retrieved.
       @return  Either the value that is associated with the search key
                or null if no such object exists. */
   public V getValue(K key) {
	   V result = null;
	   Node<T> currentNode = firstNode;
	   if((currentNode != null) && !key.equals(currentNode.getKey()) > 0) {
		   result = currentNode.getNextNode;
	   } else if ((currentNode != null)  && key.equals(currentNode.getKey())) {
		   result = currentNode.getValue();
	   } else {
		   result = null;
	   }
	   return result;
   }
   
   /** Sees whether a specific entry is in this dictionary.
       @param key  An object search key of the desired entry.
       @return  True if key is associated with an entry in the dictionary. */
   public boolean contains(K key) {
	   Node<T> currentNode = firstNode;
	   while((currentNode != null) && !key.equals(currentNode.getKey()) {
		   currentNode = currentNode.getNextNode();
	   } 
	   if (currentNode != null)
	   {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   /** Creates an iterator that traverses all search keys in this dictionary.
       @return  An iterator that provides sequential access to the search
                keys in the dictionary. */
   public Iterator<K> getKeyIterator(){
	   return new KeyIterator();
   }
   
   /** Creates an iterator that traverses all values in this dictionary.
       @return  An iterator that provides sequential access to the values
                in this dictionary. */
   public Iterator<V> getValueIterator(){
	   return new ValueIterator();
   }
   
   /** Sees whether this dictionary is empty.
       @return  True if the dictionary is empty. */
   public boolean isEmpty(){
	   if(numberOfEntries > 0) {
		   return false;
	   } else {
		   return true;
	   }
   }
   
   /** Gets the size of this dictionary.
       @return  The number of entries (key-value pairs) currently
                in the dictionary. */
   public int getSize() {
	   return numberOfEntries;
   }
   
   /** Removes all entries from this dictionary. */
   public void clear() {
	   firstNode = null;
	   numberOfEntries = 0;
   }


	
	private class Entry<K, V>
	{
		private S key;
		private T value;
		
		
		private Entry(K searchKey, V dataValue)
		{
			key = searchKey;
			value = dataValue;
		}
		
		private K getKey()
		{
			return key;
		}
		
		private V getValue()
		{
			return value;
		}
		
		
		private void setValue(V newValue)
		{
			value = newValue;
		}
		
		private void removeEntry()
		{
			key = null;
			value = null;
			
		}
	}

		private class Node<T> {
			private K key;
			private V value;
			private Node<T> next;
			
			public Node(Node<T> next, K key, V value) {
				this.key = key; 
				this.next = next;
				this.value = value;
			}
			
			public void setNextNode(Node<T> next) {
				this.next = next;
			}
			
			public void setValue(V value) {
				this.value = value;
			}
			
			public void setKey(K key) {
				this.key = key;
			}
			
			public Node<T> getNextNode() {
				return next;
			}
			public K getKey() {
				return key;
			}
			
			public V getValue() {
				return value;
			}
		
		
		private class KeyIterator implements Iterator<T> {
			private Node<T> nextNode;
			
			private KeyIterator() {
				nextNode = firstNode;
			}
			public boolean hasNext() {
				return nextNode != null;
				
			}
			public K next() {
				K result;
				if(hasNext()) {
					result = nextNode.getKey();
					nextNode = nextNode.getNextNode();
				}
				else{
					throw new NoSuchElementException();
				}
				return result;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		}
		
		private class ValueIterator implements Iterator<T> {
			private Node<T> nextNode;
			
			private ValueIterator() {
				nextNode = firstNode;
			}
			
			publi boolean hasNext() {
				return nextNode != null;
				
			}
			
			public V next() {
				V result;
				if(hasNext()) {
					result = nextNode.getValue();
					nextNode = nextNode.getNextNode();
				}
				else {
					throw new NoSuchElementException();
				}
				return result;
				
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}