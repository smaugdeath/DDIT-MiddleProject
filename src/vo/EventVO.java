package vo;

public class EventVO {
	
	private String event_id;
	private String event_enddate;
	private int event_contmileage;
	private String event_startdate;
	
	public EventVO() { }

	public EventVO(String event_id, String event_enddate, int event_contmileage, String event_startdate) {
		this.event_id = event_id;
		this.event_enddate = event_enddate;
		this.event_contmileage = event_contmileage;
		this.event_startdate = event_startdate;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getEvent_enddate() {
		return event_enddate;
	}

	public void setEvent_enddate(String event_enddate) {
		this.event_enddate = event_enddate;
	}

	public int getEvent_contmileage() {
		return event_contmileage;
	}

	public void setEvent_contmileage(int event_contmileage) {
		this.event_contmileage = event_contmileage;
	}

	public String getEvent_startdate() {
		return event_startdate;
	}

	public void setEvent_startdate(String event_startdate) {
		this.event_startdate = event_startdate;
	}
	
}
