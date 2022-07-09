package InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03InputOutputStreamTest {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("C:\\111.jpg");
		FileOutputStream fos = new FileOutputStream("D:\\111.jpg");
		int len = 0;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		// 提高效率
//		byte[] bs = new byte[1024];
//		int len = 0;
//		while((len = fis.read(bs))!=-1) {
//			fos.write(bs,0,len);
//		}
		fos.close();
		fis.close();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
