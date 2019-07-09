package vo;

public class ProductVO {
	
	private int product_id;
	private String product_name;
	private int product_price;
	private String product_status;
	private String prodtype_id;
	
	public ProductVO() { }

	public ProductVO(int product_id, String product_name, int product_price, String product_status,
			String prodtype_id) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_status = product_status;
		this.prodtype_id = prodtype_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_status() {
		return product_status;
	}

	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}

	public String getProdtype_id() {
		return prodtype_id;
	}

	public void setProdtype_id(String prodtype_id) {
		this.prodtype_id = prodtype_id;
	}
	
}
