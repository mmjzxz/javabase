package Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Data\\Demo01BufferedWriter.txt"));
		for (int i = 0; i < 10; i++) {
			bw.write("Ã´Ã´¼¦"+(i+1));
			//bw.write("\r\n");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
