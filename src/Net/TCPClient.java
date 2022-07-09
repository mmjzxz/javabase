package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * ���췽����
 * 	Socket(String host,int part)������һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
 * 		������
 * 			String host:����������������/��������IP��ַ
 * 			int part:�������Ķ˿ں�
 * ��Ա������
 * 	OutputStream getOutputStream():���ش��׽��ֵ������
 * 	InputStream getInputStream():���ش��׽��ֵ�������
 * 	void close():�رմ��׽���
 * 
 * ���裺
 * 	1������һ���ͻ��˶���socket�����췽���󶨷�������IP��ַ�Ͷ˿ں�
 * 	2��ʹ��Socket�����еķ���getOutputStream()��ȡ�����ֽ������OutputStream����
 * 	3��ʹ�������ֽ������OutputStream�����еķ���write������������������
 * 	4��ʹ��Socket�����еķ���getInputStream()��ȡ�����ֽ�������InputStream����
 * 	5��ʹ�������ֽ�������InputStream�����еķ���read,��ȡ��������д������
 * 	6���ͷ���Դ��Socket��
 * ע�⣺
 *  1���ͻ��˺ͷ������˽��н���������ʹ��Socket���ṩ��������������ʹ���Լ�������������
 *  2�������Ǵ����ͻ��˶���Socket��ʱ�򣬾ͻ�ȥ����������ͷ���������3�����ֽ�������ͨ·
 *  	��ʱ���������û����������ô�ͻ��׳��쳣
 *  	����������Ѿ���������ô�Ϳ��Խ��н�����
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1",8888);
		
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("���������".getBytes());
		
		InputStream inputStream = socket.getInputStream();
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		System.out.println(new String(bs,0,len));
		
		socket.close();
	}
}
