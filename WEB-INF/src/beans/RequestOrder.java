package beans;

public class RequestOrder {
	private int request_number = 0; // 購入依頼番号
	private String user_id = null; // ユーザーid
	private String user_name = null;
	private String author = null; // ユーザーid
	private String comment = null; // コメント
	private String date = null; // 日付
	private String published_date = null; // 日付
	private String request_name = null; // 商品名
	private String category_name = null;
	private int state = 0; // 依頼完了
	private int category = 0;

	// 初期値を引数に持たないコンストラクタ
	public RequestOrder() {
	}

	// 初期値を引数に持つコンストラクタ
	public RequestOrder(String user_id, String author, String comment, String published_date, String request_name,
			String category_name) {
		this.user_id = user_id;
		this.author = author;
		this.comment = comment;
		this.published_date = published_date;
		this.request_name = request_name;
		this.category_name = category_name;

	}

	public RequestOrder(String user_id, String date, String author, String comment, String published_date,
			String request_name,
			int category) {
		this.user_id = user_id;
		this.author = author;
		this.comment = comment;
		this.published_date = published_date;
		this.date = date;
		this.request_name = request_name;
		this.category = category;

	}

	public RequestOrder(String user_id, String author, String comment, String published_date, String request_name,
			int category) {
		this.user_id = user_id;
		this.author = author;
		this.comment = comment;
		this.published_date = published_date;
		this.request_name = request_name;
		this.category = category;

	}

	public int getRequest_number() {
		return request_number;
	}

	public String getUser_id() {
		return user_id;
	}

	public String getComment() {
		return comment;
	}

	public String getDate() {
		return date;
	}

	public String getPublished_date() {
		return published_date;
	}

	public String getRequest_name() {
		return request_name;
	}

	public int getState() {
		return state;
	}

	public int getCategory() {
		return category;
	}

	public void setRequest_number(int request_number) {
		this.request_number = request_number;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}

	public void setRequest_name(String request_name) {
		this.request_name = request_name;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}