package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
	public static void main(String[] args) throws IOException {
		File file = new File("Data\\Demo01Writer.txt");
		if(file.exists()) {
			Demo01(file);
		}else {
			file.createNewFile();
			Demo01(file);
		}
	}

	private static void Demo01(File file) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(file,true);
		for (int i = 0; i < 10; i++) {
			fw.write("Ã´Ã´¼¦"+i+"\r\n");
		}
		fw.close();
	}
}
