package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;
import utility.DriverAccessor;

public class LoginDAO extends DriverAccessor {

	public User certifyUser(String id, Connection connection) {

		try {
			String sql = "select * from profile inner join user on profile.id = user.id where user.id = ?;";

			PreparedStatement stmt = connection.prepareStatement(sql);
			// 数字は何個目の？かを表す
			stmt.setString(1, id);

			ResultSet rs = stmt.executeQuery();

			rs.first();

			User user = new User();
			user.setUser_id(rs.getString("user.id"));
			user.setUser_name(rs.getString("name"));
			user.setUser_pass(rs.getString("pass"));
			user.setUser_role(rs.getInt("role"));

			stmt.close();
			rs.close();

			return user;

		} catch (SQLException e) {

			e.printStackTrace();

			return null;
		} finally {
		}
	}
}
