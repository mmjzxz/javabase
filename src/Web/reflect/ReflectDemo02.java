package Web.reflect;

import java.lang.reflect.Field;

import Web.domain.Person;

public class ReflectDemo02 {
	/*
	 * * Class�����ܣ�
	* ��ȡ���ܣ�
		1. ��ȡ��Ա������
			* Field[] getFields() ����ȡ����public���εĳ�Ա����
			* Field getField(String name)   ��ȡָ�����Ƶ� public���εĳ�Ա����

			* Field[] getDeclaredFields()  ��ȡ���еĳ�Ա���������������η�
			* Field getDeclaredField(String name)  
		2. ��ȡ���췽����
			* Constructor<?>[] getConstructors()  
			* Constructor<T> getConstructor(��<?>... parameterTypes)  

			* Constructor<T> getDeclaredConstructor(��<?>... parameterTypes)  
			* Constructor<?>[] getDeclaredConstructors()  
		3. ��ȡ��Ա�����ǣ�
			* Method[] getMethods()  
			* Method getMethod(String name, ��<?>... parameterTypes)  

			* Method[] getDeclaredMethods()  
			* Method getDeclaredMethod(String name, ��<?>... parameterTypes)  

		4. ��ȡȫ����	
			* String getName() 
	 */
	public static void main(String[] args) throws Exception{
		Class personClass = Person.class;
		
		Field[] fields1 =  personClass.getFields();
		for (Field field : fields1) {
			System.out.println(field);
		}
		
		System.out.println("-------------------------------------");
		Field a = personClass.getField("a");
		//Field b = personClass.getField("b");�쳣
		System.out.println(a);
		//System.out.println(b);
		Person person = new Person();
		Object value = a.get(person);
		System.out.println(value);
		
		a.set(person, "aaa");
		System.out.println(person);
		System.out.println("-------------------------------------");
		
		Field[] fields2 = personClass.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field);
		}
		
		Field d = personClass.getDeclaredField("d");
		//1���Է���Ȩ�����η��İ�ȫ���
		d.setAccessible(true);//��������
		d.set(person, "ddd");
		Object value2 = d.get(person);
		System.out.println(value2);
		
	}
}
