package vo;

public class Following {
	
	private String sellerid;
	private String customerid;
	
	public Following() { }

	public Following(String sellerid, String customerid) {
		this.sellerid = sellerid;
		this.customerid = customerid;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	
}
