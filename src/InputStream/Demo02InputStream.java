package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Data\\Demo01OutputStream.txt");
		byte[] bs = new byte[6];
		int len = fis.read(bs);
		System.out.println(len);
		System.out.println(Arrays.toString(bs));
		System.out.println("===========================");
		String string = new String(bs);
		System.out.println(string);
	}
}
