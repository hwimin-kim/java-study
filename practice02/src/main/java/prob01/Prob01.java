package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		int num1 = 0; // 몫
		int num2 = 0; // 나머지
		System.out.print("금액: ");
		int number = scanner.nextInt();
		for(int i=0; i<MONEYS.length; i++) {
			num1 = number / MONEYS[i];
			num2 = number % MONEYS[i];
			if(num1 != 0 ) {
				System.out.println(MONEYS[i]+"원: "+num1+"개");
				number = num2;
			}
		}
		
		scanner.close();
 	}
}