package CommonInterface_0929.Consumer;

import java.util.function.Consumer;

public class Demo02Consumer {
	public static void consumerString(String s,Consumer<String> one,Consumer<String> two) {
//		one.accept(s);
//		two.accept(s);
		one.andThen(two).accept(s);
	}
	
	public static void main(String[] args) {
		consumerString("MMmmj",
					(t)->{
						System.out.println(t.toUpperCase().toString());
					},
					(t)->{
						System.out.println(t.toLowerCase().toString());
					});
	}
}
