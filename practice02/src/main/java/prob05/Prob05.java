package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int max = 100;
		int min = 1;
		int index = 1;
		
		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt( 100 ) + 1;
		System.out.println(correctNumber);
		
		while( true ) {
			
			/* 입력 */
			System.out.println(min+"-"+max);
			System.out.print(index+">>");
			int number = scanner.nextInt();
			
			if(number > correctNumber) {
				System.out.println("더 낮게");
				max = number;
			}else if(number < correctNumber){
				System.out.println("더 높게");
				min = number;
			}else {
				System.out.println("맞았습니다.");
				
				//새 게임 여부 확인하기
				System.out.print( "다시 하겠습니까(y/n)>>" );
				String answer = scanner.next();
				if( "y".equals( answer ) == false ) {
					break;
				}else {
				// 리셋
					max = 100;
					min = 1;
					index = 0;
					correctNumber = random.nextInt( 100 ) + 1;
					System.out.println(correctNumber);
				}
			}
			index ++;
		}
		
		scanner.close();
	}

}