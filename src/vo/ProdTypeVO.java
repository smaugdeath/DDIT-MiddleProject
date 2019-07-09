package vo;

public class ProdTypeVO {
	
	private String prodtype_id;
	private String prodtype_name;
	
	public ProdTypeVO() { }

	public ProdTypeVO(String prodtype_id, String prodtype_name) {
		this.prodtype_id = prodtype_id;
		this.prodtype_name = prodtype_name;
	}

	public String getProdtype_id() {
		return prodtype_id;
	}

	public void setProdtype_id(String prodtype_id) {
		this.prodtype_id = prodtype_id;
	}

	public String getProdtype_name() {
		return prodtype_name;
	}

	public void setProdtype_name(String prodtype_name) {
		this.prodtype_name = prodtype_name;
	}
	
}
