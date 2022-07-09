package Web.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import Web.domain.Person;

public class ReflectTest {
	public static void main(String[] args) throws Exception{
		/*
		 * ǰ�᣺���ܸı������κδ��룬���Դ���������Ķ��󣬿���ִ�����ⷽ��
		 */
//		Person p = new Person();
//		p.eat();
		//1.���������ļ�
		//1.1����Properties����
		Properties pro = new Properties();
		//1.2���������ļ���ת��Ϊһ������
		//1.2.1��ȡclassĿ¼�µ������ļ�
		ClassLoader classLoader = ReflectTest.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("Web/pro.properties");
		pro.load(is);
		
		//2.��ȡ�����ļ��ж��������
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		
		//3.���ظ�����ڴ�
		Class cls = Class.forName(className);
		//4.��������
		Object obj = cls.newInstance();
		//5.��ȡ��������
		Method method = cls.getMethod(methodName);
		//6.ִ�з���
		method.invoke(obj);
	}
}
