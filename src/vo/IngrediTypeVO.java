package vo;

public class IngrediTypeVO {
	
	private String ingreditype_id;
	private String ingreditype_name;
	
	public IngrediTypeVO() { }

	public IngrediTypeVO(String ingreditype_id, String ingreditype_name) {
		this.ingreditype_id = ingreditype_id;
		this.ingreditype_name = ingreditype_name;
	}

	public String getIngreditype_id() {
		return ingreditype_id;
	}

	public void setIngreditype_id(String ingreditype_id) {
		this.ingreditype_id = ingreditype_id;
	}

	public String getIngreditype_name() {
		return ingreditype_name;
	}

	public void setIngreditype_name(String ingreditype_name) {
		this.ingreditype_name = ingreditype_name;
	}
	
}
