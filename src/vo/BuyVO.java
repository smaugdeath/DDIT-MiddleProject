package vo;

public class BuyVO {

	private int buy_id;
	private String buy_date;
	private String mem_id;
	private String buy_status;
	
	public BuyVO() {}

	public BuyVO(int buy_id, String buy_date, String mem_id, String buy_status) {
		this.buy_id = buy_id;
		this.buy_date = buy_date;
		this.mem_id = mem_id;
		this.buy_status = buy_status;
	}

	public int getBuy_id() {
		return buy_id;
	}

	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}

	public String getBuy_date() {
		return buy_date;
	}

	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getBuy_status() {
		return buy_status;
	}

	public void setBuy_status(String buy_status) {
		this.buy_status = buy_status;
	}
	
}
