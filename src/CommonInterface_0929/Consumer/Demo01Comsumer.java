package CommonInterface_0929.Consumer;

import java.util.function.Consumer;
/*
 * Consumer�ӿ���һ�������ͽӿڣ�������ʲô���ͣ��Ϳ���ʹ��accept��������ʲô���͵�����
 */
public class Demo01Comsumer {
	public static void method(String name,Consumer<String> consumer) {
		consumer.accept(name);
	}
	
	public static void main(String[] args) {
		method("mmjôôߴ",(String name)->{
			//System.out.println(name);
			//1�ַ�����ת���
			String rename = new StringBuffer(name).reverse().toString();
			System.out.println(rename);
		});
	}
}
