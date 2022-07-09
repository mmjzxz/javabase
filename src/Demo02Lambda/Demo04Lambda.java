package Demo02Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Lambda {
	public static Comparator<String> getComparator(){
		// 1优化
//		return (String o1,String o2)->{
//			return o2.length()-o1.length();
//		};
		
		// 2优化
		return (o1,o2)->o2.length()-o1.length();
//		return new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o2.length()-o1.length();
//			}
//			
//		};
	}
	
	public static void main(String[] args) {
		String[] string = {"aaaaaa","bb","cccccccc","d"};
		System.out.println(Arrays.toString(string));
		
		Arrays.sort(string,getComparator());
		System.out.println(Arrays.toString(string));
	}
}
