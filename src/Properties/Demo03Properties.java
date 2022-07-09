package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo03Properties {
	public static void main(String[] args) throws IOException, IOException {
		Demo03();
	}

	private static void Demo03() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.load(new FileReader("Data\\Demo01Properties.txt"));
		Set<String> set = properties.stringPropertyNames();
		for (String string : set) {
			System.out.println(string + "=" + properties.getProperty(string));
		}
	}
}
