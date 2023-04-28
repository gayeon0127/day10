package time_ex;



public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("시작");
		
		try { // 예외처리
			Thread.sleep(3000); // 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("끝");
	
	}
	

}
