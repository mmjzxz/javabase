package Net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo02TestTCPClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Data\\�ǿ�.jpg");

		Socket socket = new Socket("127.0.0.1",8888);
		OutputStream os = socket.getOutputStream();
		int len = 0;
		byte[] bs = new byte[1024];
		while ((len = fis.read(bs)) != -1) {
			os.write(bs, 0, len);
		}
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		while ((len = is.read(bs)) != -1) {
			System.out.println(new String(bs,0,len));
		}
		
		fis.close();
		socket.close();
	}
}
