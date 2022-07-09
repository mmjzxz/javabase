package Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo02Properties {
	public static void main(String[] args) throws IOException {
		Demo02();
	}

	private static void Demo02() throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.setProperty("Âí¶ûÔú¹ş", "19");
		properties.setProperty("µÏÀöÈÈ°Í", "18");
		properties.setProperty("¹ÅÁ¦ÄÈÔú", "18");
		
		FileWriter fw = new FileWriter("Data\\Demo01Properties.txt");
		properties.store(fw, "save data");
		fw.close();
		//ÂÒÂë
		properties.store(new FileOutputStream("Data\\Demo02Properties.txt"), "");
	}
}
