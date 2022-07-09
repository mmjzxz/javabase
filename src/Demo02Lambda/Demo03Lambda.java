package Demo02Lambda;

public class Demo03Lambda {
	public static void startThread(Runnable run) {
		new Thread(run).start();
	}
	
	public static void main(String[] args) {
		startThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"ôôߴ1");
			}
		});
		
		startThread(()->{
			System.out.println(Thread.currentThread().getName()+"ôôߴ2");
		});
		
		startThread(()->System.out.println(Thread.currentThread().getName()+"ôôߴ3"));
	}
}
