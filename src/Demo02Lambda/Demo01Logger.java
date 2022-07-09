package Demo02Lambda;
/*
 * 	日志案例
 * 	存在性能浪费问题
 *  	调用showLog方法，传递的第二个参数是一个拼接后的字符串
 *  	先把字符串拼接好，然后再调用showLog方法
 *  	方法中如果传递的日志登记不是1级
 *  	那么就不会是如此拼接后的字符串
 */
public class Demo01Logger {
	public static void showLog(int level,String message) {
		if(level == 1) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = "world";
		String msg3 = "java";
		
		showLog(2, msg1+msg2+msg3);
		
		
	}
}
