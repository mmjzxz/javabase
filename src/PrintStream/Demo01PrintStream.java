package PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream:
 * 		1��ֻ�������ݵ���������������ݵĶ�ȡ
 * 		2���������������ͬ����Զ�����׳�IO�쳣
 * 		3�������еķ�����print��println
 */
public class Demo01PrintStream {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new File("Data\\Demo01PrintStream.txt"));
		ps.write(97);// a
		ps.println(97);
		ps.println(2.3);
		ps.println('a');
		ps.println("ôôߴ");
		ps.println(true);
		ps.close();
	}
}
