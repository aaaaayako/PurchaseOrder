package control;

import java.sql.Connection;
import java.util.Stack;

import beans.RequestOrder;
import dao.RequestDAO;

public class RequestManager {
	// 属性
	private Connection connection = null;

	// 引数を持たないコンストラクタ
	public RequestManager() {
	}

	// 新規購入依頼登録のメソッド
	public void registRequest(RequestOrder requestOrder) {
		// 商品DAOオブジェクトを生成
		RequestDAO dao = new RequestDAO();


		// DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = dao.createConnection();


		// 注文追加
		dao.registRequest(requestOrder, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

	}

	// 購入一覧メソッド
	public Stack<RequestOrder> getList() {

		RequestDAO dao = new RequestDAO();

		this.connection = dao.createConnection();

		Stack<RequestOrder> requestOrderList = dao.getList(this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		return requestOrderList;

	}




}
