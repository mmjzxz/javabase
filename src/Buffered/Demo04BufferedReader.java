package Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Data\\Demo01BufferedWriter.txt"));
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}
}
