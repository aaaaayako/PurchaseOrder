package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;

import beans.RequestOrder;
import utility.DriverAccessor;

public class RequestDAO extends DriverAccessor {
	// 新規購入依頼登録のメソッド
	public void registRequest(RequestOrder requestOrder, Connection connection) {
		try {
			String sql = "insert into request (user_id,request_name,comment,published_date,category,author) values(?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, requestOrder.getUser_id());
			stmt.setString(2, requestOrder.getRequest_name());
			stmt.setString(3, requestOrder.getComment());
			stmt.setString(4, requestOrder.getPublished_date());
			stmt.setInt(5, requestOrder.getCategory());
			stmt.setString(6, requestOrder.getAuthor());
			// データ登録を実行
			stmt.executeUpdate();
			// 終了処理
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
		}
	}

	// 購入依頼一覧のメソッド
	public Stack<RequestOrder> getList(Connection connection) {

		try {
			String sql = "select * from request inner join profile on request.user_id = profile.id ";

			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);

			Stack<RequestOrder> requestOrderList = new Stack<RequestOrder>();

			// 登録されている注文を繰り返す
			while (rs.next()) {
				RequestOrder requestOrder = new RequestOrder();
				requestOrder.setRequest_number(rs.getInt("number"));
				requestOrder.setUser_name(rs.getString("profile.name"));
				requestOrder.setDate(rs.getString("created"));
				requestOrder.setRequest_name(rs.getString("request_name"));
				requestOrder.setPublished_date(rs.getString("published_date"));
				requestOrder.setComment(rs.getString("comment"));
				requestOrder.setState(rs.getInt("state"));
				requestOrder.setCategory(rs.getInt("category"));

				requestOrderList.push(requestOrder);
			}
			// 終了処理
			stmt.close();
			rs.close();

			return requestOrderList;

		} catch (SQLException e) {

			e.printStackTrace();

			return null;

		} finally {
		}
	}

	public void editRequestOrder(RequestOrder requestOrder, Connection connection) {
		try {
			String sql = "update request set request_user = ?,count = ?,comment = ?,product_name = ?,price = ?,request_complete = ?,category = ? where number = ?;";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, requestOrder.getUser_id());
			stmt.setString(2, requestOrder.getRequest_name());
			stmt.setString(3, requestOrder.getComment());
			stmt.setString(4, requestOrder.getPublished_date());
			stmt.setInt(5, requestOrder.getCategory());
			// データ登録を実行
			stmt.executeUpdate();
			// 終了処理
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
		}
	}

	public void delete(int request_number, Connection connection) {

		try {
			String sql = "delete from request where number= ? ";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, request_number);
			stmt.executeUpdate();

			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
		}
	}


}

