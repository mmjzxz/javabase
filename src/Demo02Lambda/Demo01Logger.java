package Demo02Lambda;
/*
 * 	��־����
 * 	���������˷�����
 *  	����showLog���������ݵĵڶ���������һ��ƴ�Ӻ���ַ���
 *  	�Ȱ��ַ���ƴ�Ӻã�Ȼ���ٵ���showLog����
 *  	������������ݵ���־�Ǽǲ���1��
 *  	��ô�Ͳ��������ƴ�Ӻ���ַ���
 */
public class Demo01Logger {
	public static void showLog(int level,String message) {
		if(level == 1) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "world";
		String msg3 = "java";
		
		showLog(2, msg1+msg2+msg3);
		
		
	}
}
