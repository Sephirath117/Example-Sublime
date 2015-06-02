
import java.util.Scanner;
import java.io.File;
public class Method{
	

	public static void main(String[] args) {
		Scanner readFile = null;
		String methodContents  = null;
		try{
 			 readFile = new Scanner(new File("Method.txt"));
 			 
 		}catch (Exception e) {
 			e.printStackTrace();
 		}

 		while(readFile.hasNext()){
 				methodContents+=readFile.next();
 		}
 		new Method().processMethod(methodContents);
	}



	private void processMethod(String methodContents){
			
		
	}





}