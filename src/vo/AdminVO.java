package vo;

public class AdminVO {

	private String admin_id;
	private String mem_name;
	
	public AdminVO() {}

	public AdminVO(String admin_id, String mem_name) {
		this.admin_id = admin_id;
		this.mem_name = mem_name;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
}
