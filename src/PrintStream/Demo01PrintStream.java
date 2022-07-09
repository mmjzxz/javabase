package PrintStream;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream:
 * 		1、只负责数据的输出，不负责数据的读取
 * 		2、与其他输出流不同，永远不会抛出IO异常
 * 		3、有特有的方法，print，println
 */
public class Demo01PrintStream {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new File("Data\\Demo01PrintStream.txt"));
		ps.write(97);// a
		ps.println(97);
		ps.println(2.3);
		ps.println('a');
		ps.println("么么叽");
		ps.println(true);
		ps.close();
	}
}
