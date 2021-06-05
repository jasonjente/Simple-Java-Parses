import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainApp {

	public static <T> void main(String[] args) throws IOException {
		/*
		 * Queue testing :
		 * 
		 *
		System.out.println("Part A,utilisation of FIFO Queue ");
		IntQueueImpl<Integer> i = new IntQueueImpl<>();
		
		i.put(1);
		i.put(2);
		i.put(3);
		i.put(4);
		i.put(5);
		i.put(6);
		i.printQueue(System.out);
		System.out.println("--------------");
		i.get();
		System.out.println(i.size());
		System.out.println("--------------");
		i.printQueue(System.out);
		System.out.println("--------------");
		*/
		/*
		 * Stack testing. Lifo: 
		 *
		StringStackImpl<String> s = new StringStackImpl<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		s.printStack(System.out);
		System.out.println("--------------");
		s.pop();
		System.out.println(s.size());
		System.out.println("--------------");
		System.out.println(s.peek());
		System.out.println("--------------");
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.size());
		s.printStack(System.out);
		System.out.println("--------------");
		*/
		/*
		TagMatching tag = new TagMatching();
		System.out.println("The html file you inserted is valid : " + tag.isMatching());
		*/
		NetBenefit nb = new NetBenefit();
		nb.callMeMaybe();
		
		
		
	}

}
