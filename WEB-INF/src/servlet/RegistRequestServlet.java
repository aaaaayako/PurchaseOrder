package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RequestOrder;
import control.RequestManager;

public class RegistRequestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");



		HttpSession session = request.getSession();
		RequestOrder requestOrder = (RequestOrder) session.getAttribute("requestOder");
		System.out.println(requestOrder.getUser_id());

		new RequestManager().registRequest(requestOrder);

		response.sendRedirect(response.encodeRedirectURL("student/requestSuccess.jsp"));
	}
}

