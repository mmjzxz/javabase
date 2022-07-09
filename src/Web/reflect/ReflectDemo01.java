package Web.reflect;

import Web.domain.Person;

public class ReflectDemo01 {
	/*
	 * * ��ȡClass����ķ�ʽ��
	1. Class.forName("ȫ����")�����ֽ����ļ����ؽ��ڴ棬����Class����
		* �����������ļ��������������������ļ��С���ȡ�ļ���������
	2. ����.class��ͨ������������class��ȡ
		* �����ڲ����Ĵ���
	3. ����.getClass()��getClass()������Object���ж����š�
		* �����ڶ���Ļ�ȡ�ֽ���ķ�ʽ

	* ���ۣ�
		ͬһ���ֽ����ļ�(*.class)��һ�γ������й����У�ֻ�ᱻ����һ�Σ�����ͨ����һ�ַ�ʽ��ȡ��Class������ͬһ����
	 */
	public static void main(String[] args) throws Exception {
		Class cls = Class.forName("Web.domain.Person");
		System.out.println(cls);
		Class cls2 = Person.class;
		System.out.println(cls2);
		Person person = new Person();
		Class cls3 = person.getClass();
		System.out.println(cls3);
		
		System.out.println(cls == cls2);
		System.out.println(cls == cls3);
		System.out.println(cls2 == cls3);
	}
}
