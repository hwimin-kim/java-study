package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.print("수를 입력하세요:");
		int number = scanner.nextInt();
		int num = 0;
		int sum = 0;
		if((number%2)==0 &&number>0) {
			num = number/2;
			sum = num*(num+1);
			System.out.println("결과 값: "+sum);
		}else if((number%2)==1 &&number>0) {
			num = number/2 + 1;
			sum = num*num;
			System.out.println("결과 값: "+sum);	
		}else {
			System.out.println("결과 값: 0");
		}
		scanner.close();
	}
}
