package ObjectStream;

import java.io.Serializable;
/*
 * δʵ��serializable�ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л�
 * Serializable�ӿڣ�����ͽӿ�
 * 		Ҫ�������л��ͷ����л��������ʵ��Serializable�ӿڣ��ͻ�������һ�����
 * 		�����ǽ������л��ͷ����л���ʱ�򣬾ͻ������Ƿ���������
 * 			�У���������л��ͷ����л�
 * 			�ޣ����׳�NotSerializableException�쳣
 * static��
 * 		��̬�����ڷǾ�̬���ص��ڴ��У���̬�����ڶ�������ڴ��У�
 * 		��static���εĳ�Ա�������ܱ����л������л��Ķ��Ƕ���
 * transient�ؼ��֣�˲̬�ؼ���
 * 		��transient���εĳ�Ա�������ܱ����л�
 */
public class Person implements Serializable{
	
	static final long serialVersionUID = 1L;
	private String name;
	/*
	 * Person {name=�������, age=0}
	  *   �������0
	 */
	private int age;//����static����Ϊ0
	
	@Override
	public String toString() {
		return "Person {name=" + name + ", age=" + age + "}";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
