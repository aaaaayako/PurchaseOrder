package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.User;
import utility.DriverAccessor;

public class UserDAO extends DriverAccessor {

	// 管理者情報を取り出すメソッド
	public ArrayList getList(int user_role, Connection connection) {
		try {
			String sql = "select * from profile inner join user on profile.id = user.id where user.role = ?;";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, user_role);
			ResultSet rs = stmt.executeQuery();

			ArrayList list = new ArrayList();

			// 登録されているユーザーを繰り返す
			while (rs.next()) {
				User user = new User();
				user.setUser_id(rs.getString("id"));
				user.setUser_name(rs.getString("name"));

				list.add(user);
			}
			// 終了処理
			stmt.close();
			rs.close();
			return list;

		} catch (SQLException e) {

			e.printStackTrace();

			return null;

		} finally {
		}
	}

	public ArrayList getUserList(int user_role, Connection connection) {
		try {
			String sql = "select * from profile inner join user on profile.id = user.id where user.role = ?;";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, user_role);
			ResultSet rs = stmt.executeQuery();

			ArrayList userList = new ArrayList();

			// 登録されているユーザーを繰り返す
			while (rs.next()) {
				User user = new User();
				user.setUser_id(rs.getString("id"));
				user.setUser_name(rs.getString("name"));

				userList.add(user);
			}
			// 終了処理
			stmt.close();
			rs.close();
			return userList;

		} catch (SQLException e) {

			e.printStackTrace();

			return null;

		} finally {
		}
	}

	public void changeAdministrator(int role, String id, Connection connection) {

		try {
			// sql文
			// パラメータとして後から指定する部分には、実際の値を記述する替わりに「?」を記述
			String sql = "update user set role = ? where id = ?;";

			// SQL文を実行
			PreparedStatement stmt = connection.prepareStatement(sql);

			// ?に入る値
			stmt.setInt(1, role);
			stmt.setString(2, id);

			// データ登録を実行
			stmt.executeUpdate();
			// 終了処理
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
		}
	}

}