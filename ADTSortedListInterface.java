/** Interface for sorted List
	@author Elshaday Assefa	
	@version 1.0
	*/
	
	public interface ADTSortedList<T> {
		/** add entry to sorted list so that the list remains sorted
		@param new entry, item to plsce in sorted List
		*/
		public void add(T newEntry);
		
		/** removes the first or only occurrance of an entry from the sorted list
		@returns true if item was located and removed, false if item not located, list left untouched
		*/
		public boolean remove(T anEntry);
		
		/** find and return position of given value
		@returns integer value representing position of entry
		*/
		public int getPosition( T anEntry);
		// all other methods are included in List Interface which are going to be inherited by Sorted List ADT
	}