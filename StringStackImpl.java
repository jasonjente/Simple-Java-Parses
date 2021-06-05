import java.io.PrintStream;
import java.util.NoSuchElementException;
//stack: last in first out
public class StringStackImpl<T> implements StringStack<T> {
	//When the constructor is called a linked list gets created by calling the apropriate methods/and constructors
	//
	private static int n = 0; 		//#of strings in the stack updates, with push and pop.
	//The list is created by calling the LinkedList constructor
	private final LinkedList<T> list = new LinkedList<T>();		
	//isEmpty checks if the list is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}

	//adds the first item to the stack of data type T
	public void push(T item) {
		list.addFirst(item);
		n++;
	}

	//Throws exception if empty, removes the first node of the stack and returns it. n decreases
	public T pop() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		n--;
		return list.removeFirst();
	}

	//returns the data of the first object in the list
	public T peek() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return list.peaking();
		
	}

	
	public void printStack(PrintStream stream) {
		list.printListStack(System.out);
		
	}

	//returns the size/height of the stack
	public int size() {
		if (isEmpty()) {
			return 0;
		}else {
			return n;
		}
	}
	
	

}
