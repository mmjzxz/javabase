package CommonInterface_0929.supplier;

import java.util.function.Supplier;

/*
 * Supplier<T>接口仅包含一个无参的方法：T get()用来获取一个泛型参数指定类型的对象数据
 * Supplier<T>接口被称为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 */
public class Demo01Supplier {
	//定义一个方法，方法的参数传递Supplier<T>接口，泛型执行String，get方法就会返回一个String
	public static String getString(Supplier<String> supplier) {
		return supplier.get();
	}
	
	public static void main(String[] args) {	
		System.out.println(getString(()->{
			return "么么叽1";
		}));
		System.out.println(getString(()->"么么叽2"));
	}
}
