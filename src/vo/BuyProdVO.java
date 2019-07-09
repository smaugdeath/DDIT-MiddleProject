package vo;

public class BuyProdVO {

	private int buy_id;
	private int product_id;
	private int buyprod_qty;
	
	public BuyProdVO() { }

	public BuyProdVO(int buy_id, int product_id, int buyprod_qty) {
		this.buy_id = buy_id;
		this.product_id = product_id;
		this.buyprod_qty = buyprod_qty;
	}

	public int getBuy_id() {
		return buy_id;
	}

	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getBuyprod_qty() {
		return buyprod_qty;
	}

	public void setBuyprod_qty(int buyprod_qty) {
		this.buyprod_qty = buyprod_qty;
	}
	
}
