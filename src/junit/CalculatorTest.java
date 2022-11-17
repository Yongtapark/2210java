package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator obj;
	//@Test가 붙어있는 메소드를 실행전 실행
	//객체 생성, 초기화에 사용, 반드시 public이어야 함
	
	@Before
	public void prepare() {
		System.out.println("prepare...");
		obj=new Calculator();
	}
	@Test
	public void testSub() {
		System.out.println("sub...");
		assertEquals(0,obj.sub(1, 1));
	}
	@Test
	public void testMul() {
		System.out.println("mul...");
		assertEquals(1,obj.mul(1, 1));
	}
	@Test
	public void testDiv() {
		System.out.println("div...");
		assertEquals(2,obj.div(10, 5));
	}
	
}
