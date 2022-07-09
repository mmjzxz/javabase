package CommonInterface_0929.supplier;

import java.util.function.Supplier;

/*
 * Supplier<T>�ӿڽ�����һ���޲εķ�����T get()������ȡһ�����Ͳ���ָ�����͵Ķ�������
 * Supplier<T>�ӿڱ���Ϊ�����ͽӿڣ�ָ���ӿڵķ�����ʲô���ͣ���ô�ӿ��е�get�����ͻ�����ʲô���͵�����
 */
public class Demo01Supplier {
	//����һ�������������Ĳ�������Supplier<T>�ӿڣ�����ִ��String��get�����ͻ᷵��һ��String
	public static String getString(Supplier<String> supplier) {
		return supplier.get();
	}
	
	public static void main(String[] args) {	
		System.out.println(getString(()->{
			return "ôôߴ1";
		}));
		System.out.println(getString(()->"ôôߴ2"));
	}
}
