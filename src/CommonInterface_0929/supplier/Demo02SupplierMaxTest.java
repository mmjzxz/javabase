package CommonInterface_0929.supplier;

import java.util.function.Supplier;

public class Demo02SupplierMaxTest {
	public static void main(String[] args) {
		int array[] = {2,7,3,827,472,92,16,-20};
		int maxNum = getMax(()->{
			int max = array[0];
			for(int i = 0;i<array.length;i++) {
				System.out.print(array[i]+" ");
				if(array[i]>=max) {
					max = array[i];
				}
			}
			return max;
		});
		System.out.println();
		System.out.println(maxNum);
	}
	
	public static int getMax(Supplier<Integer> supplier) {
		return supplier.get();
	}
}
