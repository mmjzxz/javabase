package OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
 * 调用FileOutputStream对象中的方法write，把数据写入到文件中
 * 释放资源
 */
public class Demo01OutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("Data\\Demo01OutputStream.txt");
		if(file.exists()) {
			System.out.println("Data\\Demo01OutputStream.txt文件已存在");
		}else {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(97);
		fos.close();
	}
}
