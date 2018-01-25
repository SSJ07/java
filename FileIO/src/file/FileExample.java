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
			 * Get absolute path of file
			 */
			System.out.println("Absolute path of file is :" + file.getAbsolutePath());
			
			/**
			 * We can check permission of file using methods like:
			 * 	canRead()
			 * 	canWrite()
			 * 	canExecute()
			 */
			System.out.println("Can read this file:" + file.canRead());
			System.out.println("Can write this file:" + file.canWrite());
			System.out.println("Can execute this file:" + file.canExecute());
			System.out.println("last modified :" + file.lastModified());
			System.out.println("File name is :" + file.getName());
			System.out.println("File length is :" + file.length());
			System.out.println("File parent is :" + file.getParent()) ;
			/**
			 * output will be first time run:
			 * 
			 *	is abc.txt exist file ?:true
				is abc.txt exist file ?:true
				Absolute path of file is :~\java\FileIO\abc.txt
				Can read this file:true
				Can write this file:true
				Can execute this file:true
				last modified :1516300405734
				File name is :abc.txt
				File length is :0
				File parent is :null
			 *
			 */
			
			
	}

}
