package Net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Demo02TestTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		/*
		 * �÷�����һֱ���ڼ���״̬����ѭ��accept������
		 * ��һ���ͻ����ϴ��ļ����ͱ���һ���ļ�
		 */
		while(true) {
			Socket socket = serverSocket.accept();
			/*
			 * ���߳���߳���Ч��
			 * ��һ���ͻ����ϴ��ļ����Ϳ���һ���̣߳�����ļ����ϴ�
			 */
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try{
						InputStream is = socket.getInputStream();
						File file = new File("Net");
						if(!file.exists()) {
							file.mkdirs();
						}
						/*
						 * �Զ����ļ����������򣺷�ֹͬ�����ļ�������
						 * ��������+����ֵ+�����
						 */
						String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(111)+".jpg";
						FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
						int len = 0;
						byte[] bs = new byte[1024];
						while((len = is.read(bs))!=-1) {
							fos.write(bs,0,len);
						}
						socket.getOutputStream().write("�ϴ��ɹ�".getBytes());
						fos.close();
						socket.close();
					}catch(IOException e) {
						System.out.println(e);
					}
				}
			}).start();
			
		}
	}
}
