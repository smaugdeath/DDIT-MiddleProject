package vo;

public class PostVO {

	private int post_id;
	private int post_parentid;
	private String post_title;
	private String post_content;
	private String post_date;
	private String mem_id;
	private int board_id;
	
	public PostVO() { }

	public PostVO(int post_id, int post_parentid, String post_title, String post_content, String post_date,
			String mem_id, int board_id) {
		this.post_id = post_id;
		this.post_parentid = post_parentid;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_date = post_date;
		this.mem_id = mem_id;
		this.board_id = board_id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public int getPost_parentid() {
		return post_parentid;
	}

	public void setPost_parentid(int post_parentid) {
		this.post_parentid = post_parentid;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public String getPost_date() {
		return post_date;
	}

	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	
}
