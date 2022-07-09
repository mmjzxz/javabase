package CommonInterface_0929.Consumer;

import java.util.function.Consumer;

public class Demo03ConsumerTest {
	public static void printInfo(String[] arr,Consumer<String> con1,Consumer<String> con2) {
		for (String string : arr) {
			con1.andThen(con2).accept(string);
		}
	}
	public static void main(String[] args) {
		String[] array = {"�����������","�����Ȱͣ�Ů","����������Ů"};
		printInfo(array,
				(string)->{
					String name = string.split("��")[0];
					System.out.print("������"+name);
				},
				(string)->{
					String sex = string.split("��")[1];
					System.out.println(" �Ա�"+sex);
				});
	}
}
