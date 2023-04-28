package practice;

/*
 * 연산담당
 * 온도 올리기, 내리기
 * 온도는 TempDTO에 있는 변수 활용
 */

public class TempService {
	private TempDTO dto = new TempDTO();
	
	public void up() {
		System.out.println("온도를 올립니다.");
		int t = dto.getTemp();
		t = t+1;
		dto.setTemp(t);
		System.out.println("완료");
	}
	
	public void down() {
		System.out.println("온도를 내립니다.");
		int t = dto.getTemp();
		t = t-1;
		dto.setTemp(t);
		System.out.println("완료");

	}
	
	public void print() {
		System.out.println("현재 온도를 확인합니다.");
		System.out.println("현재 온도 : " + dto.getTemp());
	}

}
