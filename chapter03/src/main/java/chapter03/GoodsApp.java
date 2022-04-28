package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		Goods goods1 = new Goods("tv", 1000, 10, 10);
		Goods goods2 = new Goods("radio");
		Goods goods3 = new Goods();
		
		goods.setName("nikon");
		goods.setPrice(-1);
		goods.setCountSold(50);
		goods.setCountStock(30);
		
		System.out.println("Goods Count: "+ Goods.countOfGoods);
		
		goods.showInfo();
		goods1.showInfo();
		goods2.showInfo();
		
		goods.setPrice(2000);
		int discountPrice = goods.calcDiscountPrice(0.5);
		System.out.println("Goods Discount price: "+ discountPrice);
	}
}
