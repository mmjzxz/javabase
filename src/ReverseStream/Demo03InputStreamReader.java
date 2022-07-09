package ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03InputStreamReader {
	public static void main(String[] args) throws IOException {
		read_gbk();
		System.out.println("========================");
		read_utf8();
	}

	private static void read_utf8() throws IOException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("Data\\Demo02OutputStreamWriter.txt"),"utf-8");
		int len = 0;
		while((len = isr.read())!= -1) {
			System.out.print((char)len);
		}
		isr.close();
	}

	private static void read_gbk() throws IOException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("Data\\Demo02OutputStreamWriter.txt"),"gbk");
		int len = 0;
		while((len = isr.read())!= -1) {
			System.out.print((char)len);
		}
		isr.close();
	}
}
