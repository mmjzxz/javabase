package Web.reflect;

import Web.domain.Person;

public class ReflectDemo01 {
	/*
	 * * 获取Class对象的方式：
	1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
		* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
	2. 类名.class：通过类名的属性class获取
		* 多用于参数的传递
	3. 对象.getClass()：getClass()方法在Object类中定义着。
		* 多用于对象的获取字节码的方式

	* 结论：
		同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
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
