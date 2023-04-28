package quiz;

/*
 * 시간 설정 및 연산
 * 현재 시간 
 * 종료 시간
 * 사용 시간 = 종료시간 - 현재시간 
 */

public class TimeService {
	TimeDTO dto = new TimeDTO();
	
	public void start() {
		long start = System.currentTimeMillis();
		dto.setStart(start);
		System.out.println("시작 시간이 기록되었습니다.");
	}
	
	public void end() {
		long end = System.currentTimeMillis();
		dto.setStart(end);
		System.out.println("종료 시간이 기록되었습니다.");
	}
	
	public void resultTime() {
		dto.setResultTime((int)(dto.getEnd()-dto.getStart()));
		long min = dto.getResultTime() / 1000 / 60 ;
		long sec = dto.getResultTime() / 1000 % 60;
		System.out.println(min+"분 "+sec+"초 사용하셨습니다.");
		
	}

}
