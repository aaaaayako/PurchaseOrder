package servlet;

import java.io.IOException;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RequestOrder;
import beans.User;
import control.RequestManager;

public class PurchaseRequestServlet extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");

			// EntryManagerの生成し，getListメソッドを使用
			// Entry型のArrayリストが戻り値
		Stack<RequestOrder> requestList = new RequestManager().getList();
		session.setAttribute("requestOderList", requestList);


		request.setAttribute("requestList", requestList);

			getServletContext().getRequestDispatcher("/jsp/student/requestList.jsp").forward(request, response);
		}
		}

