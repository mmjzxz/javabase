package Demo02Lambda;
/*
 * ʹ��Lambda�Ż���־����
 * lambda���ص㣺�ӳټ���
 * lambdaʹ��ǰ�᣺������ں���ʽ�ӿ�
 */
public class Demo02Lambda {
	public static void show(int level,MessageBuilder builder) {
		if(level == 1) {
			System.out.println(builder.buildMessage());
		}
	}
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "world";
		String msg3 = "java";
		
		show(1,()->{
			return msg1+msg2+msg3;
		});
		/*
		 * ʹ��lambda���ʽ��Ϊ�������ݣ������ǰѲ������ݵ�show������
		 * ֻ��������������־�ĵȼ���1��
		 * 	�Ż���ýӿ�MessageBuilder�еķ���buildMessage
		 * 	�Ż�����ַ�����ƴ��
		 * �����־�ĵȼ�����1��
		 * 	��ôMessageBuilder�ӿ��еķ���buildMessageҲ����ִ��
		 * 	����ƴ���ַ����Ĵ���Ҳ����ִ��
		 */
	}
}
