package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RequestOrder;
import beans.User;

public class CheckRequestServlet extends HttpServlet {

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			request.setCharacterEncoding("UTF-8");
			
		// jspから値を取得
		String request_name = request.getParameter("request_name");
		String author = request.getParameter("author");
		String published_date = request.getParameter("published_date");
		String comment = request.getParameter("comment");
		int category = Integer.parseInt(request.getParameter("category"));
		
		
		
		if (category == 3) {
			String category_name = "情報一般";
		}
		if (category == 4) {
			request.setAttribute("category_name", "ハードウェア");
		}
		if (category == 5) {
			request.setAttribute("category_name", "OS");
		}
		if (category == 6) {
			request.setAttribute("category_name", "言語");
		}
		if (category == 7) {
			request.setAttribute("category_name", "アプリケーション");
		}
		if (category == 8) {
			request.setAttribute("category_name", "情報通信/インターネット");
		}
		if (category == 9) {
			request.setAttribute("category_name", "情報科学");
		}
		if (category == 10) {
			request.setAttribute("category_name", "コンピュータ資格試験");
		}
		if (category == 11) {
			request.setAttribute("category_name", "その他");
		}
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		RequestOrder requestOrder = new RequestOrder(user.getUser_id(), author, comment, published_date, request_name,
				category);
		
		session.setAttribute("requestOrder", requestOrder);

		System.out.println(requestOrder.getUser_id());

		request.setAttribute("request_name", request_name);
		request.setAttribute("author", author);
		request.setAttribute("published_date", published_date);
		request.setAttribute("comment", comment);

		getServletContext().getRequestDispatcher("/jsp/student/checkBookRequest.jsp").forward(request, response);
		}
	}


