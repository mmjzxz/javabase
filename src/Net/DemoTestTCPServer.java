package Net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoTestTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		File file = new File("Net");
		if(!file.exists()) {
			file.mkdirs();
		}
		FileOutputStream fos = new FileOutputStream(file+"\\星空.jpg");
		int len = 0;
		byte[] bs = new byte[1024];
		while((len = is.read(bs))!=-1) {
			fos.write(bs,0,len);
		}
		socket.getOutputStream().write("上传成功".getBytes());
		fos.close();
		socket.close();
		serverSocket.close();
	}
}
