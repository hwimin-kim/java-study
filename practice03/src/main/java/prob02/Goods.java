package prob02;

public class Goods {
	
	private String productName;
	private int price;
	private int count;
	
	Goods(String[] goodsDetail){
		this.productName = goodsDetail[0];
		this.price = Integer.parseInt(goodsDetail[1]);
		this.count =Integer.parseInt(goodsDetail[2]);
	}
	
	public void getProduct() {
		System.out.println(this.productName+"(가격: "+this.price+"원)이 "+this.count+"개 입고 되어습니다.");
	}

}
