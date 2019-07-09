package vo;

public class MemberVO {

	private String mem_id;
	private String mem_pw;
	private String mem_name;
	private int mem_phone;
	private String mem_address;
	private String mem_email;
	private String mem_joindate;
	private String mem_code;
	private String mem_zipcode;
	private String mem_address2;
	
	public MemberVO() { }

	public MemberVO(String mem_id, String mem_pw, String mem_name, int mem_phone, String mem_address, String mem_email,
			String mem_joindate, String mem_code, String mem_zipcode, String mem_address2) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_phone = mem_phone;
		this.mem_address = mem_address;
		this.mem_email = mem_email;
		this.mem_joindate = mem_joindate;
		this.mem_code = mem_code;
		this.mem_zipcode = mem_zipcode;
		this.mem_address2 = mem_address2;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public int getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(int mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_address() {
		return mem_address;
	}

	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_joindate() {
		return mem_joindate;
	}

	public void setMem_joindate(String mem_joindate) {
		this.mem_joindate = mem_joindate;
	}

	public String getMem_code() {
		return mem_code;
	}

	public void setMem_code(String mem_code) {
		this.mem_code = mem_code;
	}

	public String getMem_zipcode() {
		return mem_zipcode;
	}

	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}

	public String getMem_address2() {
		return mem_address2;
	}

	public void setMem_address2(String mem_address2) {
		this.mem_address2 = mem_address2;
	}
	
}
