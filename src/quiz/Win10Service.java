package quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Win10Service {
	
	private Win10DTO dto;
	
	public Win10Service(String calc, String notepad, HashMap map) {
		dto = new Win10DTO();
		dto.setCalc(calc);
		dto.setInfo(map);
		dto.setNotepad(notepad);
	}
	
	public void view() {
		System.out.println("--성능--");
		HashMap info = dto.getInfo();
		Iterator it = info.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + info.get(key));
		}
	}
	
	public void func() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		ProcessBuilder pro = new ProcessBuilder();
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1. 계산기");
			System.out.println("2. 메모장");
			System.out.println("3. 직접 입력");
			System.out.println("-------------------");
			System.out.println("번호 입력 >>>> ");
			num = scan.nextInt();
			
			if(num==1) {
				pro.command(dto.getCalc());
			} else if(num==2) {
				pro.command(dto.getNotepad());
			} else if(num==3) {
				System.out.println("명령어를 입력하세요.");
				dto.setMsg(scan.next());
				pro.command(dto.getMsg());
			}
			try {
				pro.start();
			} catch (IOException e) {
				// e.printStackTrace();
				System.err.println(dto.getMsg()+"명령어는 존재하지 않습니다.");
			}
		}
	}
}
