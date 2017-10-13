


public class ArrayStack <T> implements StackInterface <T>
{
	private T[] stack;
	private int top;
	private static final int DEFAULT_CAPACITY = 10;
	int[] stack;
	
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		
		this(DEFAULT_CAPACITY);
		
	}
	
	
	@SuppressWarnings("")
	public ArrayStack (int desiredSize) {
		stack = (T[]) new Object [desiredSize]
		top = -1;
		
	}
	
	public void push(T newEntry) {
		
		if(top == stack.length - 1) 
		{
			System.out.print("Stack is full.");
		}
		else
		
	}
	
	public void clear() {
		checkInitialization();
		int numberOfEntries = stack.length;
		while (!isEmpty()) {
			stack[numberOfEntries-1] = null;
			numberOfEntries--;
		}
		
		
	}



}