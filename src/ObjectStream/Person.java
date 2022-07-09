package ObjectStream;

import java.io.Serializable;
/*
 * 未实现serializable接口的类将无法使用任何状态序列化或反序列化
 * Serializable接口：标记型接口
 * 		要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
 * 		当我们进行序列化和反序列化的时候，就会检测类是否有这个标记
 * 			有，则可以序列化和反序列化
 * 			无，则抛出NotSerializableException异常
 * static：
 * 		静态优先于非静态加载到内存中（静态优先于对象进入内存中）
 * 		被static修饰的成员变量不能被序列化，序列化的都是对象
 * transient关键字：瞬态关键字
 * 		被transient修饰的成员变量不能被序列化
 */
public class Person implements Serializable{
	
	static final long serialVersionUID = 1L;
	private String name;
	/*
	 * Person {name=马尔扎哈, age=0}
	  *   马尔扎哈0
	 */
	private int age;//加上static年龄为0
	
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
