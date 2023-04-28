package quiz;

import java.util.Scanner;

/*
 * 1. 시작
 * 2. 종료
 * 3. 사용시간 확인
 */

public class TimeMainClass {
	public static void main(String[] args) {
		TimeService t = new TimeService();
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("================");
			System.out.println("1. 시작");
			System.out.println("2. 종료");
			System.out.println("3. 사용시간 확인");
			System.out.println("4. 종료");
			System.out.println("================");
			System.out.println("번호 입력 >>>> ");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				t.start();
				break;
			case 2:
				t.end();
				break;
			case 3:
				t.resultTime();
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
		
	}
}
