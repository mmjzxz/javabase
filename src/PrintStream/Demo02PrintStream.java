package PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo02PrintStream {
	public static void main(String[] args) throws IOException {
		System.out.println("控制台");
		PrintStream ps = new PrintStream(new File("Data\\Demo02PrintStream.txt"));
		System.setOut(ps);
		System.out.println("打印流目的地");
		ps.close();
	}
}
