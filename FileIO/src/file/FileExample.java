package file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {

			/**
			 * This line will not create any file.
			 */
			File file = new File("abc.txt");
			
			/**
			 * This line checks file is exist or not
			 */
			System.out.println("is abc.txt exist file ?:"+ file.exists());
			
			/**
			 * This line will create new file with given name
			 */
			file.createNewFile();
			
			System.out.println("is abc.txt exist file ?:"+ file.exists());
			
			/**
			 * output will be first time run:
			 * 
			 * is abc.txt exist file ?:false
			   is abc.txt exist file ?:true
			 */
	}

}
