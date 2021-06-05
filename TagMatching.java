import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TagMatching {
	private final String path = "C:\\Users\\AbabaLaptop\\eclipse-workspace\\domesDedomenwn Ergasia 1\\src\\myfile.html";
	private BufferedReader br;
	
	public <T> boolean isMatching () throws IOException {
		
		String str = null;
		String topItem = null;
		StringStackImpl<String> stack = new StringStackImpl<>(); 
		br = new BufferedReader(new FileReader(path));
		str = br.readLine();
		//Usually html files start with this !DOCTYPE TAG we ignore it as it is not part of the body
		if(str.equals("<!DOCTYPE>"))str = br.readLine();
		//Start reading the html file(Called via buffered reader)
		while((str = br.readLine()) != null) {
			//Seperate the sentence in words and put them in the line array
		    String[] line = str.split("\\s") ;
		    //for each word in the line 
		    for(String word : line) {
		    	//if the word starts with "<" then it is a beggining tag and we push it in the stack
		        if(word.contains("<")&&!word.contains("</")){
		            stack.push(word);
		        }
		        //if the word starts with "</" then it is a closing tag.
		        //check if the first tag in the stack is the same as the word, if they have the same name they 
		        if(word.startsWith("</")&& !stack.isEmpty()) {
		            topItem = stack.peek().replaceAll("[^a-zA-Z ]", "");
		            if(topItem.equals(word.replaceAll("[^a-zA-Z ]", ""))){
		                stack.pop();
		            }
		        }
		    } 
	  	}
	  	br.close();
	  	if(stack.isEmpty())
	  		return true;
	  	System.out.println("Error the html file contains unclosed tags");
	  	stack.printStack(System.out);
		return stack.isEmpty();
		   
	}
	

}
