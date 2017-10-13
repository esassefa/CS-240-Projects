@author Elshaday Assefa

import java.util.Vector;

public class VectorStack<T> implements StackInterface<T> {
	Vector vec;
	
	public VectorStack {
		
		vec = new Vector();
	}
	
	public void push(E newEntry) {
		
		if ()
		vec.addElement(newEntry);
		return vec;
	}
	public T pop() {
		int len = vec,size();
		T object = null;
		if (len == 0 ) {
			throw new EmptyStackException();
		}
		else {
			object = items.elementsAt(len - 1);
			vec.removeElementAt(len - 1);
			return object;
		}
	}
	
	public T peek() {
		return vec.lastElement();
		
	}
	
	public boolean isEmpty() {
		if (vec.size() == 0)
			return true;
		else
			return false;
		
	
	}
	public void clear() {
		vec.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}