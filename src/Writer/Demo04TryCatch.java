package Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04TryCatch {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("Data\\Demo02Writer.txt",true);
			for (int i = 0; i < 10; i++) {
				fw.write("么么鸡"+i+"\r\n");
			}
		}catch(IOException e){
			System.out.println(e);
		}finally {
			//非空释放资源
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
