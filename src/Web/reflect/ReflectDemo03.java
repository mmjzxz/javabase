package Web.reflect;

import java.lang.reflect.Constructor;

import Web.domain.Person;

public class ReflectDemo03 {
	public static void main(String[] args) throws Exception{
		Class<Person> personClass = Person.class;
		/*
		 * 2. ��ȡ���췽����
			* Constructor<?>[] getConstructors()  
			* Constructor<T> getConstructor(��<?>... parameterTypes)  

			* Constructor<T> getDeclaredConstructor(��<?>... parameterTypes)  
			* Constructor<?>[] getDeclaredConstructors()  
		 */
		Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
		System.out.println(constructor);
		
		//1��������
		Object person = constructor.newInstance("�������",23);
		System.out.println(person);
		
		System.out.println("----------------------");
		
		Constructor<Person> constructor2 = personClass.getConstructor();
		System.out.println(constructor2);
		Object person1 = constructor2.newInstance();
		System.out.println(person1);
		
		Object o = personClass.newInstance();
		System.out.println(o);
	}
}
