package Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04TryCatch {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("Data\\Demo02Writer.txt",true);
			for (int i = 0; i < 10; i++) {
				fw.write("ôô��"+i+"\r\n");
			}
		}catch(IOException e){
			System.out.println(e);
		}finally {
			//�ǿ��ͷ���Դ
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
