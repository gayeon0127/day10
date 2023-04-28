package quiz;

import java.util.HashMap;
import java.util.Scanner;

import quiz.Win10Service;

public class WinMainClass {
	public static void main(String[] args) {
		
		HashMap info = new HashMap();
		info.put("메모리", "16GB");
		info.put("시스템", "64bit");
		
		Win10Service win10 = new Win10Service("calc", "notepad", info);
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("===================");
			System.out.println("1. 성능");
			System.out.println("2. 기능");
			System.out.println("===================");
			System.out.println("번호 입력 >>>> ");
			num = scan.nextInt();
			
			switch(num) {
			case 1 :
				win10.view();
				break;
			case 2 :
				win10.func();
				break;
			}
		}
		
	}
}
