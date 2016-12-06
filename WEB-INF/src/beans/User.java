package beans;

public class User {
	private String user_id = null; // ユーザーid
	private String user_name = null; // ユーザーの名前
	private String user_address = null; // ユーザーのメールアドレス
	private String user_pass = null; // ユーザーのパスワード
	private int user_role = 0; // ユーザーの役割

	// 初期値を引数に持たないコンストラクタ
	public User() {
	}

	// 初期値を引数に持つコンストラクタ
	public User(String user_id, String user_name, String user_address, String user_pass, int user_role) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_pass = user_pass;
		this.user_role = user_role;
	}

	// Getter & Setter
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public int getUser_role() {
		return user_role;
	}

	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}
}