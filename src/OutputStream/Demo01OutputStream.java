package OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����һ��FileOutputStream���󣬹��췽���д���д�����ݵ�Ŀ�ĵ�
 * ����FileOutputStream�����еķ���write��������д�뵽�ļ���
 * �ͷ���Դ
 */
public class Demo01OutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("Data\\Demo01OutputStream.txt");
		if(file.exists()) {
			System.out.println("Data\\Demo01OutputStream.txt�ļ��Ѵ���");
		}else {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(97);
		fos.close();
	}
}
