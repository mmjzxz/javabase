package Demo01FunctionalInterface;
/*
 * ����ʽ�ӿڵ�ʹ�ã�һ�������Ϊ�����Ĳ����ͷ���ֵ����
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
				System.out.println("�����ڲ�����д�ӿ��еĳ��󷽷�");
			}
			
		});
		// lambda���ʽ
		show(()->{
			System.out.println("ʹ��lambda���ʽ��д�ӿ��еĳ��󷽷�");
		});
		
		// ��lambda���ʽ
		show(()->System.out.println("ʹ�ü�lambada���ʽ"));
	}
}
