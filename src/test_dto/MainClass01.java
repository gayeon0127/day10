package test_dto;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		int age = 0;
		String name=null;
			
		Scanner input = new Scanner(System.in);
		
		int num;
		MemberService mem = new MemberService();
		
		
		while(true) {
			System.out.println("1. 이름 입력");
			System.out.println("2. 나이 입력");
			System.out.println("3. 모든 내용 출력");
			System.out.println("4. 종료");
			System.out.println("번호 >>>> ");
			num=input.nextInt();
			
		switch(num) {
		case 1 :
			mem.inputName();
			break;
		case 2 :
			mem.inputAge();
			break;
		case 3 :
			mem.print();
			break;
		case 4 :
			System.out.println("종료합니다.");
			break;
		}
	   
		}	
	}
}

