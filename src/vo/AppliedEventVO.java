package vo;

public class AppliedEventVO {

	private String event_id;
	private int product_id;
	
	public AppliedEventVO() {
	}

	public AppliedEventVO(String event_id, int product_id) {
		this.event_id = event_id;
		this.product_id = product_id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
}
