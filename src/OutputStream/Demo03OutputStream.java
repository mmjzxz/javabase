package OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	׷��д/��д��ʹ�����������Ĺ��췽��
 * 		FileOutputStream(String name,boolean append)
 * 			����һ�������ָ��name���ļ���д�����ݵ�����ļ���
 * 		FileOutputStream(File file,boolean append)
 * 			����һ����ָ��File�����ʶ���ļ���д�����ݵ��ļ������
 * 		������
 * 			String name,File file:д�����ݵ�Ŀ�ĵ�
 * 			boolean append:׷��д����
 * 				true���������󲻻Ḳ��Դ�ļ����������ļ���ĩβ׷��д����
 * 				false:����һ�����ļ�������Դ�ļ�
 * 	���У����з���
 * 		Windows: \r\n
 * 		linux: /n
 * 		mac: /r
 */
public class Demo03OutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("Data\\Demo02OutputStream.txt");
		if (file.exists()) {
			System.out.println("Data\\Demo02OutputStream.txt�ļ��Ѵ���");
		} else {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream("Data\\Demo02OutputStream.txt", true);
		for (int i = 0; i < 10; i++) {
			fos.write("mmj".getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}
}
