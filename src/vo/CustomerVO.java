package vo;

public class CustomerVO {

	private String customer_gender;
	private String customer_birth;
	private int customer_mileage;
	private String customer_cardnum;
	private String mem_id;
	
	public CustomerVO() { }

	public CustomerVO(String customer_gender, String customer_birth, int customer_mileage, String customer_cardnum,
			String mem_id) {
		this.customer_gender = customer_gender;
		this.customer_birth = customer_birth;
		this.customer_mileage = customer_mileage;
		this.customer_cardnum = customer_cardnum;
		this.mem_id = mem_id;
	}

	public String getCustomer_gender() {
		return customer_gender;
	}

	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	public String getCustomer_birth() {
		return customer_birth;
	}

	public void setCustomer_birth(String customer_birth) {
		this.customer_birth = customer_birth;
	}

	public int getCustomer_mileage() {
		return customer_mileage;
	}

	public void setCustomer_mileage(int customer_mileage) {
		this.customer_mileage = customer_mileage;
	}

	public String getCustomer_cardnum() {
		return customer_cardnum;
	}

	public void setCustomer_cardnum(String customer_cardnum) {
		this.customer_cardnum = customer_cardnum;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
}
