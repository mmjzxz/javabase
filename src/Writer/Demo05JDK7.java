package Writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05JDK7 {
	public static void main(String[] args) {
		//ÎÄ¼þ¸´ÖÆ
		try(FileInputStream fis = 
				new FileInputStream("Data\\Demo01OutputStream.txt");
			FileOutputStream fos = 
					new FileOutputStream("Data\\Demo01OutputStream.txt");){
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
