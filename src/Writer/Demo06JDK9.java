package Writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06JDK9 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream("Data\\Demo01OutputStream.txt");
			FileOutputStream fos = 
				new FileOutputStream("Data\\Demo01OutputStream.txt");
		//ÎÄ¼þ¸´ÖÆ
		try(fis;fos){
			int len = 0;
			while((len = fis.read())!=-1) {
				fos.write(len);
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
