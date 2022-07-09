package ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		writer_gbk();
		writer();
		writer_utf8();
	}

	private static void writer_utf8() throws IOException, IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("Data\\Demo02OutputStreamWriter.txt",true),"utf-8");
		osw2.write("小马宝莉"+"\r\n");
		osw2.flush();
		osw2.close();
	}

	private static void writer() throws IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("Data\\Demo02OutputStreamWriter.txt",true));
		osw1.write("1111"+"\r\n");
		osw1.flush();
		osw1.close();
	}

	private static void writer_gbk() throws IOException, IOException {
		// TODO Auto-generated method stub
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Data\\Demo02OutputStreamWriter.txt",true), "gbk");
		osw.write("么么叽么么鸡"+"\r\n");
		osw.flush();
		osw.close();
	}
}
