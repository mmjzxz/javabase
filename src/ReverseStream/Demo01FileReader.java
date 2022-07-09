package ReverseStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Data\\Demo02OutputStream.txt");
//		int len = 0;
//		while((len = fr.read())!=-1) {
//			System.out.print((char)len);
//		}
		
		char[] cs = new char[1024];
		int len = 0;
		while((len = fr.read(cs))!=-1) {
			System.out.println(new String(cs));
		}
		fr.close();
	}
}
