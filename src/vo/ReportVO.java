package vo;

public class ReportVO {

	private String report_id;
	private String report_content;
	private String mem_id;
	private String report_user;
	
	public ReportVO() {}

	public ReportVO(String report_id, String report_content, String mem_id, String report_user) {
		this.report_id = report_id;
		this.report_content = report_content;
		this.mem_id = mem_id;
		this.report_user = report_user;
	}

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public String getReport_content() {
		return report_content;
	}

	public void setReport_content(String report_content) {
		this.report_content = report_content;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getReport_user() {
		return report_user;
	}

	public void setReport_user(String report_user) {
		this.report_user = report_user;
	}
	
}
