package vo;

public class SalesVO {

	private int sales_id;
	private String mem_id;
	private String sales_date;
	private int buy_id;
	
	public SalesVO() {}

	public SalesVO(int sales_id, String mem_id, String sales_date, int buy_id) {
		this.sales_id = sales_id;
		this.mem_id = mem_id;
		this.sales_date = sales_date;
		this.buy_id = buy_id;
	}

	public int getSales_id() {
		return sales_id;
	}

	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getSales_date() {
		return sales_date;
	}

	public void setSales_date(String sales_date) {
		this.sales_date = sales_date;
	}

	public int getBuy_id() {
		return buy_id;
	}

	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}
	
}
