/**  ADT for Lists that impelements ADTList Interface
	@author Elshaday Assefa
	@version 1.0
	*/
	import java.util.Arrays;
	
	public class ArrayList<T> implements ADTListInterface<T> {
		
		private T[] List;
		private int numberOfEntries;
		private final int DEFAULT_CAPACITY = 10;
		private final int MAX_CAPACITY = 10000;
		private boolean intitialized  = false;
		
		public ArrayList() {
			this(DEFAULT_CAPACITY); //default constructor
		}
		
		public ArrayList(int initialCapacity) {
			if (initialCapacity < DEFAULT_CAPACITY) {
				initialCapacity = DEFAUlT_CAPACITY;
			} 
			@SuppressWarnings("unchecked")
			T[] tempList = (T[])new Object[initialCapacity + 1];
			list = tempList;
			numberOfEntries = 0;
			initialized = true;
			checkCapacity(initialCapacity);
				
		}
		
		public void add(T newEntry) {
			checkInitialzation();
			list[numberOfEntries + 1] = newEntry;
			numberOfEntries++;
			ensureCapacity();
			      
			
			
		}
		
		public void add(int position, T newEntry) {
			@SuppressWarnings("unchecked")
			T[] tempList = (T[]) new Object[initialCapacity + 1]; // created temporary list(unchecked cast) to store data without losing any
			tempList - List;
			for(int i = position;i < List.length, i++) {
				tempList[i + 1] = List[i];// to insert entry at specific position, i moved the index 1 level higher for items higher than position
			}
			tempList[position] = newEntry;
			numberOfEntries++;
		}
		
		public T remove(int position) {
			if( position < 1 || position > List.length - 1) {
				throws new IndexOutOfBoundsException();
			}
			
			T[] tempList =(T[]) new Object[List.length];// created second array to store moved values with losing data
			for(int i = position; i< List.length; i++) {
				tempList[i - 1] = List[i];
			}
			
			T temp = List[position];// stores item in given position in a temp variable
			List = tempList;// copies tempList values back into List
			return temp;
		}
		
		public void clear() {
			List = null;
			numberOfEntries = 0;
		}
		
		public boolean isEmpty() {
			if(List = null) {
				return true;
			} else {
				return false;
			}
		}
		
		public T getEntry(int position) {
			if(position < 1 || position > List.length - 1) {
				throw new IndexOutOfBoundsException();
			}
			T temp = List[position];
			return temp;
		}
		
		private void ensureCapacity() {
			int capacity = List.length -1;
			if(numberOfEntries >= capacity) {
				int newCapacity = 2*capacity;
				checkCapacity(newCapacity);
			}
			
		}
		
		
	}