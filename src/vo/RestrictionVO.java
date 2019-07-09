package vo;

public class RestrictionVO {

	private String restriction_id;
	private String restriction_date;
	private String mem_id;
	private String admin_id;
	private String restriction_reason;
	
	public RestrictionVO() { }

	public RestrictionVO(String restriction_id, String restriction_date, String mem_id, String admin_id,
			String restriction_reason) {
		this.restriction_id = restriction_id;
		this.restriction_date = restriction_date;
		this.mem_id = mem_id;
		this.admin_id = admin_id;
		this.restriction_reason = restriction_reason;
	}

	public String getRestriction_id() {
		return restriction_id;
	}

	public void setRestriction_id(String restriction_id) {
		this.restriction_id = restriction_id;
	}

	public String getRestriction_date() {
		return restriction_date;
	}

	public void setRestriction_date(String restriction_date) {
		this.restriction_date = restriction_date;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getRestriction_reason() {
		return restriction_reason;
	}

	public void setRestriction_reason(String restriction_reason) {
		this.restriction_reason = restriction_reason;
	}
	
}
