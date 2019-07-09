package vo;

public class FAQVO {
	
	private String faq_id;
	private String faq_quescontent;
	private String faq_anscontent;
	
	public FAQVO() { }

	public FAQVO(String faq_id, String faq_quescontent, String faq_anscontent) {
		this.faq_id = faq_id;
		this.faq_quescontent = faq_quescontent;
		this.faq_anscontent = faq_anscontent;
	}

	public String getFaq_id() {
		return faq_id;
	}

	public void setFaq_id(String faq_id) {
		this.faq_id = faq_id;
	}

	public String getFaq_quescontent() {
		return faq_quescontent;
	}

	public void setFaq_quescontent(String faq_quescontent) {
		this.faq_quescontent = faq_quescontent;
	}

	public String getFaq_anscontent() {
		return faq_anscontent;
	}

	public void setFaq_anscontent(String faq_anscontent) {
		this.faq_anscontent = faq_anscontent;
	}
	
}
