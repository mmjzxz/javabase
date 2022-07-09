package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Data\\Demo01OutputStream.txt");
		int len = 0;
		while ((len = fis.read()) != -1) {
			System.out.println((char)len);
		}
		fis.close();
	}
}
