package vo;

public class WithdrawVO {

	private int withdraw_id;
	private String withdraw_date;
	private int withdraw_amount;
	private String mem_id;
	
	public WithdrawVO() {}

	public WithdrawVO(int withdraw_id, String withdraw_date, int withdraw_amount, String mem_id) {
		this.withdraw_id = withdraw_id;
		this.withdraw_date = withdraw_date;
		this.withdraw_amount = withdraw_amount;
		this.mem_id = mem_id;
	}

	public int getWithdraw_id() {
		return withdraw_id;
	}

	public void setWithdraw_id(int withdraw_id) {
		this.withdraw_id = withdraw_id;
	}

	public String getWithdraw_date() {
		return withdraw_date;
	}

	public void setWithdraw_date(String withdraw_date) {
		this.withdraw_date = withdraw_date;
	}

	public int getWithdraw_amount() {
		return withdraw_amount;
	}

	public void setWithdraw_amount(int withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
}
