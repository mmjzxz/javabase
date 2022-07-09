package Web.reflect;

import java.lang.reflect.Field;

import Web.domain.Person;

public class ReflectDemo02 {
	/*
	 * * Class对象功能：
	* 获取功能：
		1. 获取成员变量们
			* Field[] getFields() ：获取所有public修饰的成员变量
			* Field getField(String name)   获取指定名称的 public修饰的成员变量

			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
			* Field getDeclaredField(String name)  
		2. 获取构造方法们
			* Constructor<?>[] getConstructors()  
			* Constructor<T> getConstructor(类<?>... parameterTypes)  

			* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)  
			* Constructor<?>[] getDeclaredConstructors()  
		3. 获取成员方法们：
			* Method[] getMethods()  
			* Method getMethod(String name, 类<?>... parameterTypes)  

			* Method[] getDeclaredMethods()  
			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)  

		4. 获取全类名	
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
		//Field b = personClass.getField("b");异常
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
		//1忽略访问权限修饰符的安全检查
		d.setAccessible(true);//暴力反射
		d.set(person, "ddd");
		Object value2 = d.get(person);
		System.out.println(value2);
		
	}
}
