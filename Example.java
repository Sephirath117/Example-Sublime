
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class Example{
	

ArrayList<String> file = new ArrayList<String>();
ArrayList<Method> methods = new ArrayList<Method>();

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
 				file.add(new String(readFile.next()));
 			}

 			System.out.println(file);
 			findMethods();

 		}catch (Exception e) {
 			
 		}
 	}

 	public void findMethods(){
 		
 	}


}