package Demo02Lambda;
/*
 * 使用Lambda优化日志案例
 * lambda的特点：延迟加载
 * lambda使用前提：必须存在函数式接口
 */
public class Demo02Lambda {
	public static void show(int level,MessageBuilder builder) {
		if(level == 1) {
			System.out.println(builder.buildMessage());
		}
	}
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "world";
		String msg3 = "java";
		
		show(1,()->{
			return msg1+msg2+msg3;
		});
		/*
		 * 使用lambda表达式作为参数传递，仅仅是把参数传递到show方法中
		 * 只有满足条件，日志的等级是1级
		 * 	才会调用接口MessageBuilder中的方法buildMessage
		 * 	才会进行字符串的拼接
		 * 如果日志的等级不是1级
		 * 	那么MessageBuilder接口中的方法buildMessage也不会执行
		 * 	所以拼接字符串的代码也不会执行
		 */
	}
}
