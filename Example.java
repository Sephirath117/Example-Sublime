
import java.util.Scanner;
import java.io.File;
public class Example{
	

 public static void main(String[] args) {
 	Scanner getFile = new Scanner(System.in);
 	String fileName = "hi";

 	while(!fileName.contains(".java")){
 	System.out.println("Enter the name of the file to process.");
 	 fileName = getFile.next();
 	}

 	new Example().readFile(fileName);
 }



 	public void readFile(String filename){
 		try{
 			Scanner readFile = new Scanner(new File(filename));
 			
 			while(readFile.hasNext()){
 				System.out.print(readFile.next());
 			}

 		}catch (Exception e) {
 			
 		}
 	}


}