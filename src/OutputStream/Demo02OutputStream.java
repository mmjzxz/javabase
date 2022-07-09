package OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("Data\\Demo02OutputStream.txt");
		if(file.exists()) {
			System.out.println("Data\\Demo02OutputStream.txt文件已存在");
		}else {
			file.createNewFile();
		}
		byte[] b = {65,66,67,68};//ABCD
		//byte[] b = {-65,66,-67,68,69};//緽紻E
		FileOutputStream fos = new FileOutputStream(file);
		//fos.write(b,1,2);//BC
		//fos.write(b);
		fos.write("String".getBytes());
		fos.write("么么叽".getBytes());
		fos.close();
	}
}
