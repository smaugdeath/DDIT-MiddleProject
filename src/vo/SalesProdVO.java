package vo;

public class SalesProdVO {
	
	private int salesprod_qty;
	private int product_id;
	private int sales_id;
	
	public SalesProdVO() {}

	public SalesProdVO(int salesprod_qty, int product_id, int sales_id) {
		this.salesprod_qty = salesprod_qty;
		this.product_id = product_id;
		this.sales_id = sales_id;
	}

	public int getSalesprod_qty() {
		return salesprod_qty;
	}

	public void setSalesprod_qty(int salesprod_qty) {
		this.salesprod_qty = salesprod_qty;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getSales_id() {
		return sales_id;
	}

	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	
}
