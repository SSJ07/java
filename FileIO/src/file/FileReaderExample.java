package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		/**
		 * Create file with name example.txt and insert some text
		 */
		try {
			FileReader fileReader = new FileReader("example.txt");
			int i;
			while((i=fileReader.read())!=-1){
				System.out.print((char)i);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
