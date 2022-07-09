package Web.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Web.Junit.Calculator;

public class CalculatorTest {
	/*
	 * ��ʼ������
	 * ������Դ���룬���в��Է�����ִ��֮ǰ������ִ�и÷���
	 */
	@Before
	public void init() {
		System.out.println("init...");
	}
	/*
	 * �ͷ���Դ����
	 * �����в��Է���ִ����ɺ󣬶����Զ�ִ�и÷���
	 */
	@After
	public void close() {
		System.out.println("close");
	}
	
	@Test
	public void testAdd() {
		//System.out.println("ִ�����");
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		System.out.println("testAdd...");
		//����
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
