package test_dto;

import java.util.Scanner;

public class MemberService {
	
	Scanner input = new Scanner(System.in);
	MemberDTO dto = new MemberDTO();
	
	public void inputName() {		
		System.out.println("이름 입력");
		dto.setAge(input.nextInt());
		/*
		String name = input.next();
		dto.setName(name);
		*/
	}
	
	public void inputAge() {
		System.out.println("나이 입력");
		int age = input.nextInt();
		age = age-1;
		dto.setAge(age);
	}
	
	public void print() {
		System.out.println("이름 : "+dto.getName());
		System.out.println("만 나이 : "+dto.getAge());
	}
	
}
