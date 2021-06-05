import java.io.PrintStream;
import java.util.NoSuchElementException;

public class IntQueueImpl<T> implements IntQueue<T> {
	
	private static int n = 0;
	private final LinkedList<T> list = new LinkedList<T>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void put(T item) {
		list.addLast(item);
		n++;
	}
	public void getSum() {
		System.out.println(list.sumOfQueueItems());
	}
	
	public T get() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		n--;
		return list.removeLast();
	}

	
	public T peek() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return list.peaking();
		
	}
	public void printQueue(PrintStream stream) {
		list.printListQueue(System.out);
	}

	
	public int size() {
		if (isEmpty()) {
			return 0;
		}else{
			return n;
		}	
	
	}


	

}
