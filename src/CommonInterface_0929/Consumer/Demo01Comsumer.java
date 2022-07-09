package CommonInterface_0929.Consumer;

import java.util.function.Consumer;
/*
 * Consumer接口是一个消费型接口，泛型是什么类型，就可以使用accept方法消费什么类型的数据
 */
public class Demo01Comsumer {
	public static void method(String name,Consumer<String> consumer) {
		consumer.accept(name);
	}
	
	public static void main(String[] args) {
		method("mmj么么叽",(String name)->{
			//System.out.println(name);
			//1字符串反转输出
			String rename = new StringBuffer(name).reverse().toString();
			System.out.println(rename);
		});
	}
}
