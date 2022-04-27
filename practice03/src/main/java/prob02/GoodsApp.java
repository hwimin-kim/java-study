package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		String[] goodsOrder = new String[COUNT_GOODS];
		// 상품 입력
		System.out.println("상품 정보 입력: ");
		
		for(int i=0; i<COUNT_GOODS; i++) {
			goodsOrder[i] = scanner.nextLine();
		}
		
		for(int i=0; i<COUNT_GOODS; i++) {
			String[] goodsDetail = goodsOrder[i].split(" ");
			goods[i] = new Goods(goodsDetail);
		}

		// 상품 출력
		for(Goods goodsItem: goods) {
			goodsItem.getProduct();
		}
		
		// 자원정리
		scanner.close();
	}	
}


