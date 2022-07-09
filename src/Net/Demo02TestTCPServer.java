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
		 * 让服务器一直处于监听状态（死循环accept方法）
		 * 有一个客户端上传文件，就保存一个文件
		 */
		while(true) {
			Socket socket = serverSocket.accept();
			/*
			 * 多线程提高程序效率
			 * 有一个客户端上传文件，就开启一个线程，完成文件的上传
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
						 * 自定义文件的命名规则：防止同名的文件被覆盖
						 * 规则：域名+毫秒值+随机数
						 */
						String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(111)+".jpg";
						FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
						int len = 0;
						byte[] bs = new byte[1024];
						while((len = is.read(bs))!=-1) {
							fos.write(bs,0,len);
						}
						socket.getOutputStream().write("上传成功".getBytes());
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
