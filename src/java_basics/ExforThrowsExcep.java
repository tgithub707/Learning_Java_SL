package java_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExforThrowsExcep {
	
	public static void main(String args[]) {
		
		try {
			searchForFile();
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
		
		
	}

	public static void searchForFile() throws IOException{
		
		//File newFile = new File("C:\\Users\\koda1anu\\AutomationTraining\\FirstProject\\ABC.txt");
		File newFile = new File("ABC.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}
	
	
}
