package Web.reflect;

import java.lang.reflect.Method;

import Web.domain.Person;

public class ReflectDemo04 {
	public static void main(String[] args) throws Exception {
		Class personClass = Person.class;
        //��ȡָ�����Ƶķ���
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //ִ�з���
        eat_method.invoke(p);


        Method eat_method2 = personClass.getMethod("eat", String.class);
        //ִ�з���
        eat_method2.invoke(p,"��");

        System.out.println("-----------------");

        //��ȡ����public���εķ���
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);
        }

        //��ȡ����
        String className = personClass.getName();
        System.out.println(className);//cn.itcast.domain.Person
	}
}
