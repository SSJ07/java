package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {

		/**
		 * Create file with name example.txt and insert some text
		 */
		BufferedReader br = new BufferedReader(new FileReader("example.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
