package Web.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Web.Junit.Calculator;

public class CalculatorTest {
	/*
	 * 初始化方法
	 * 用于资源申请，所有测试方法在执行之前都会先执行该方法
	 */
	@Before
	public void init() {
		System.out.println("init...");
	}
	/*
	 * 释放资源方法
	 * 在所有测试方法执行完成后，都会自动执行该方法
	 */
	@After
	public void close() {
		System.out.println("close");
	}
	
	@Test
	public void testAdd() {
		//System.out.println("执行完毕");
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		System.out.println("testAdd...");
		//断言
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void testSub() {
		Calculator calculator = new Calculator();
		int result = calculator.sub(1, 2);
		System.out.println("testSub...");
		Assert.assertEquals(-1, result);
	}
}
