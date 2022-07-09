package Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Data\\Demo01BufferedOutputStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int len = 0;
//		while((len = bis.read())!=-1) {
//			System.out.println(len);
//		}
//		System.out.println("=========================");
		byte[] bs = new byte[1024];
		while((len = bis.read(bs))!=-1) {
			System.out.println(new String(bs,0,len));
		}
		bis.close();
	}
}
