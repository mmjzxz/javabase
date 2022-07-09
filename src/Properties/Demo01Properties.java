package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
	public static void main(String[] args) {
		Demo01();
	}

	private static void Demo01() {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.setProperty("Âí¶ûÔú¹ş", "19");
		properties.setProperty("µÏÀöÈÈ°Í", "18");
		properties.setProperty("¹ÅÁ¦ÄÈÔú", "18");
		Set<String> set = properties.stringPropertyNames();
		for (String string : set) {
			System.out.println(string+"="+properties.getProperty(string));
		}
	}
}
