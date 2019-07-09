package vo;

public class ReviewVO {

	private String review_content;
	private String review_date;
	private int review_star;
	private int buy_id;
	
	public ReviewVO() {}

	public ReviewVO(String review_content, String review_date, int review_star, int buy_id) {
		this.review_content = review_content;
		this.review_date = review_date;
		this.review_star = review_star;
		this.buy_id = buy_id;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_date() {
		return review_date;
	}

	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}

	public int getReview_star() {
		return review_star;
	}

	public void setReview_star(int review_star) {
		this.review_star = review_star;
	}

	public int getBuy_id() {
		return buy_id;
	}

	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}
	
}
