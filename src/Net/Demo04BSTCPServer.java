package Net;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo04BSTCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8080);
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
//		byte[] bs = new byte[1024];
//		int len = 0;
//		while((len = is.read(bs))!=-1) {
//			System.out.println();
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line = br.readLine();
		String[] arr = line.split(" ");
		String htmlpath = arr[1].substring(7);
		// 1注意路径问题
		FileInputStream fis = new FileInputStream(htmlpath);

		OutputStream os = socket.getOutputStream();
		// 1写入HTTP协议响应头，固定写法
		os.write("HTTP/1.1 200 OK\r\n".getBytes());
		os.write("Content-Type:text/html\r\n".getBytes());
		// 1必须要写入空格，否则浏览器不解析
		os.write("\r\n".getBytes());

		int len = 0;
		byte[] bs = new byte[1024];
		while ((len = fis.read(bs)) != -1) {
			os.write(bs,0,len);
		}
		fis.close();
		socket.close();
		serverSocket.close();
	}
}
