package Web.annotation;

public @interface MyAnno {
	int value();
	Person per();
	MyAnno2 anno2();
	String[] strs();
	 /*String name() default "уехЩ";*/
	 /*String show2();
	
	 Person per();
	 MyAnno2 anno2();
	
	 String[] strs();*/


}
