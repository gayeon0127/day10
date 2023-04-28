package constructor;

/*
 * constructor 생성자
 * 초기화 목적
 * 객체 생성시 자동 호출
 * 클래스 이름과 동일한 메소드를 가지며 반환타입, 값은 없음 
 */

class TestClass01{
	private int age;
	
	public TestClass01(int age) {
		System.out.println(age + " : 생성자 호출");
		this.age = age;
	}
	
	public TestClass01() {
		System.out.println("기본생성자");
	}
	
	public TestClass01(int a, int b) {
		System.out.println("2개받아줌");
	}
	
	public void test() {
		System.out.println("test");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(100);
		TestClass01 t02 = new TestClass01();
		TestClass01 t03 = new TestClass01(10,20);
	}
}
