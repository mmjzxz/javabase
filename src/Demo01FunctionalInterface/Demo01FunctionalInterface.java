package Demo01FunctionalInterface;
/*
 * 函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo01FunctionalInterface {
	public static void show(MyFunctionalInterface functionalInterface) {
		functionalInterface.method();
	}
	
	public static void main(String[] args) {
		show(new MyFunctionalInterfaceImpl());
		
		show(new MyFunctionalInterface() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类重写接口中的抽象方法");
			}
			
		});
		// lambda表达式
		show(()->{
			System.out.println("使用lambda表达式重写接口中的抽象方法");
		});
		
		// 简化lambda表达式
		show(()->System.out.println("使用简化lambada表达式"));
	}
}
