package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import control.LoginManager;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 文字エンコード
		request.setCharacterEncoding("UTF-8");

		// jspの入力データを取得する
		String user_id = request.getParameter("id");
		String user_pass = request.getParameter("pass");

		// managerの生成
		LoginManager manager = new LoginManager();

		// LoginManagerのcertifyメソッドを実行する。
		User user = manager.certifyUser(user_id, user_pass);

		if (null == user) {
			request.setAttribute("error", "IDとパスワードをもう一度確認してください");
			getServletContext().getRequestDispatcher("/login/login.jsp").forward(request, response);
		} else {
			// ユーザーの情報を保持する
			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			// 学生か管理者かの画面遷移
			if (user.getUser_role() == 1) {
				session.setAttribute("student", user);
				response.sendRedirect(response.encodeRedirectURL("../jsp/student/studentMenu.jsp"));
			} else {
				session.setAttribute("administrator", user);
				response.sendRedirect(response.encodeRedirectURL("../jsp/administrator/administratorMenu.jsp"));
			}
		}
	}
}