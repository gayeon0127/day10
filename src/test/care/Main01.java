package test.care;
/*
import java.util.*;
import test.java.*;
// 해당 폴더에 있는 모든 값을 사용한다는 의미
*/

import test.date.Date;
import test.java.TestClass01;
// 다른 패키지에 있는 것을 가져올 때 생성됨
import test.java.TestClass02;
import test.java.TestClass03;

public class Main01 {
	// 하나의 클래스에 public 클래스만 사용
	// class aa => 다른 페이지에서 사용 불가 
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test();
		t.num=111;
		
		TestClass01 t01 = new TestClass01();
		t01.test();
		
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		Date dd = new Date();
		// test.date.Date dd = new test.date.Date();
		dd.data();
		
		test.java.Date d01 = new test.java.Date();
		d01.data();
		// 같은 이름의 값을 import 할 수 없기 때문에
		// 위치를 명시해줘야 함. (자동으로 추가됨)
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
	}
}
