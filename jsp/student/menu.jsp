<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="include.jsp" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import= "beans.User" %>
<%	HttpSession session1 = ((HttpServletRequest)request).getSession();
User user = (User) session1.getAttribute("user"); %>
<html>


<head>
<link rel="stylesheet" type="text/css" href="/PurchaseOrder/jsp/css/menu.css" media="all">
<body>
<div class="menu">
    <div class="container-fluid">
		<div class="navbar-header">
			<a href="/PurchaseOrder/jsp/student/studentMenu.jsp">購入依頼システム</a>
		</div>
		<div>
			<ul class="nav navbar-nav navbar-right">
			    <li><a href="/PurchaseOrder/jsp/PurchaseRequestServlet">購入依頼一覧</a></li>
				<li><a href="/PurchaseOrder/jsp/LogoutServlet"><span class="glyphicon glyphicon-log-out"></span>　ログアウト</a></li>
			</ul>
		</div>
	</div>
</div>
</body>
</head>
</html>