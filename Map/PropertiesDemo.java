import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("server.properties");
		Properties property = new Properties();
		property.load(fs);
		
		System.out.println(property);
		
		FileOutputStream fo = new FileOutputStream("server.properties");
		property.setProperty("db.Name", "MySQL");
		property.store(fo, "Add New Property");
		
		System.out.println(property);

	}

}
