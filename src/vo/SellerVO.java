package vo;

public class SellerVO {

	private String seller_regnum;
	private String seller_name;
	private int seller_account;
	private String mem_id;
	
	public SellerVO() {}

	public SellerVO(String seller_regnum, String seller_name, int seller_account, String mem_id) {
		this.seller_regnum = seller_regnum;
		this.seller_name = seller_name;
		this.seller_account = seller_account;
		this.mem_id = mem_id;
	}

	public String getSeller_regnum() {
		return seller_regnum;
	}

	public void setSeller_regnum(String seller_regnum) {
		this.seller_regnum = seller_regnum;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public int getSeller_account() {
		return seller_account;
	}

	public void setSeller_account(int seller_account) {
		this.seller_account = seller_account;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
}
