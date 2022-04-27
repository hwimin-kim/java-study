package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods2 good2 = new Goods2();
		
		// public
		good2.name = "camera";
		
		// protected
		// 더 중요한 접근 제어는 자식에서 접근이 가능하다.
		//good2.price = 10000;
		
		// default
		//good2.countStock = 3;
		
		//private
		//good2.countSold = 10;
	}

}
