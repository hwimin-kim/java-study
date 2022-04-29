package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("Some more codes1");
		
		try {
		System.out.println("Some more codes2");
		
		int result  = (1+2+3)/b;
		
		System.out.println("Some more codes3");
		}catch(ArithmeticException e){
			/* 예외 처리 */
			// 1.사과
			System.out.println("미안합니다.");
			System.out.println("ArithmeticException 예외 발생");
			// 2.로깅
			System.out.println("error:" + e);
			// 3.정상 종료
			return;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			System.out.println("자원 정리");
		}
	}

}
