package Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Data\\Demo01Writer.txt");
		fw.write("ôô��ôôߴ");
		fw.write(97);
		fw.flush();
		fw.close();
	}
}
