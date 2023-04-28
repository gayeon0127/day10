package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		// 계산기 실행
		ProcessBuilder pro = new ProcessBuilder();
		String s = "calc";
		pro.command(s);
		
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
