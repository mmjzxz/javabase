package Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Data\\Demo01BufferedOutputStream.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("ôôߴôô��".getBytes());
		bos.flush();
		bos.close();
	}
}
