package PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Demo02PrintStream {
	public static void main(String[] args) throws IOException {
		System.out.println("����̨");
		PrintStream ps = new PrintStream(new File("Data\\Demo02PrintStream.txt"));
		System.setOut(ps);
		System.out.println("��ӡ��Ŀ�ĵ�");
		ps.close();
	}
}
