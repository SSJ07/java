package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		/**
		 * Create file with name example.txt and insert some text
		 */
		Scanner sc = new Scanner(new File("example.txt"));
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
