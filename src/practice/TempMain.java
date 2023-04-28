package practice;

import java.util.Scanner;

/*
 * 보여지는 공간
 * 1. 온도 올리기
 * 2. 온도 내리기
 * 3. 현재 설정 정보
 */

public class TempMain {
	public static void main(String[] args) {
		TempService s = new TempService();
		
		int temp =10;
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. 온도 올리기");
			System.out.println("2. 온도 내리기");
			System.out.println("3. 현재 설정 정보");
			System.out.println("4. 종료");
			System.out.println("===================");
			System.out.println("번호 입력 >>>> ");
			num = scan.nextInt();
			
			switch(num) {
			case 1 :
				s.up();
				break;
			case 2 :
				s.down();
				break;
			case 3 :
				s.print();
				break;
			case 4 :
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}
}
