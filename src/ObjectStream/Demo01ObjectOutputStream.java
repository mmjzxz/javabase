package ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
	public static void main(String[] args) throws IOException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("Data\\Demo01ObjectOutputStreamPerson.txt"));
		oos.writeObject(new Person("Âí¶ûÔú¹þ",18));
		oos.close();
	}
}
