package time_ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		// 100분의 1초 형식
		System.out.println(t);
		
		Date d = new Date();
		System.out.println(d);
		// database 형식과 맞출 때는 sql 사용
		
		SimpleDateFormat s = 
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm ss");
									// 표현형식 지정
									// 년 월 오전오후 시 분 초
		String st = s.format(d);
		String st2 = s.format(t);
		System.out.println(st);
		System.out.println(st2);
	}
}
