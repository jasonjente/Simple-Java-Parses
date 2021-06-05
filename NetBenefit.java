import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NetBenefit {
	private final String path = "C:\\Users\\AbabaLaptop\\eclipse-workspace\\domesDedomenwn Ergasia 1\\src\\transactions.txt";
	private BufferedReader br;
	
	public void callMeMaybe() throws IOException {
		String str = null;
		String topItem = null;
		int v=0;
		int q=0;
		int sum = 0;
		IntQueueImpl<Integer> queue = new IntQueueImpl<>();
		br = new BufferedReader(new FileReader(path));
		//str = br.readLine();
		try {
			while((str = br.readLine())!=null){
				String[] line = str.split("\\s");
				if(line[0].equals("buy")) {
					v = Integer.parseInt(line[1]);
					q = Integer.parseInt(line[3]);
					queue.put(-v*q);
					sum=+(-v*q);
					
					
				}else if(line[0].equals("sell")) {
					v = Integer.parseInt(line[1]);
					q = Integer.parseInt(line[3]);
					queue.put(v*q);
					sum =+ v*q;
				}
			}
			
		} catch (IOException e) {
			
		}
		br.close();
		System.out.println("Sum is : " + sum);
		//int sum2 =0;
		queue.printQueue(System.out);
		
	}

}
