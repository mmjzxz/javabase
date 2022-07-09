package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ���췽����
 * 	ServerSocket(int part):�����󶨵��ض��˿ڵķ������׽���
 * �������˱�����ȷһ�����飬����֪�����ĸ��ͻ�������ķ�����
 * ���Կ���ʹ��accept������ȡ������Ŀͻ��˶���Socket
 * ��Ա������
 * 	Socket accept():���������ܵ����׽��ֵ�����
 * ��������ʵ�ֲ��裺
 * 	1������������ServerSocket�����ϵͳҪָ���Ķ˿ں�
 * 	2��ʹ��ServerSocket�����еķ���accept����ȡ������Ŀͻ��˶���Socket
 * 	3��ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
 * 	4��ʹ�������ֽ�������InputStream�����еķ���read,��ȡ�ͻ��˷��͵�����
 * 	5��ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
 * 	6��ʹ�������ֽ������OutputStream�����еķ���write���ͻ��˻�д����
 * 	7���ͷ���Դ��Socket��ServerSocket��
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		System.out.println(new String(bs,0,len));
		
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("�յ�лл".getBytes());
		
		socket.close();
		serverSocket.close();
	}
}
