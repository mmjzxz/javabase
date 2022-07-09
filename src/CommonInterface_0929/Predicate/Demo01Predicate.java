package CommonInterface_0929.Predicate;

import java.util.function.Predicate;
/*
 * 对某种数据类型的数据进行判断，结果返回一个boolean值
 */
public class Demo01Predicate {
	public static boolean method(String string,Predicate<String> predicate) {
		return predicate.test(string);
	}
	
	public static void main(String[] args) {
		String string = "mmj";
//		boolean bool = method(string,(String str)->{
//			return str.length()>5;
//		});
//		System.out.println(bool);
		System.out.println(method(string,str->str.length()>5));
	}
}
