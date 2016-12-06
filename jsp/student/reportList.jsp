<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.Spending" %>
<%@ page import= "java.util.Stack" %>
<%
Stack spendingList =  (Stack)request.getAttribute("spendingList");
%>
<!DOCTYPE html>
<meta charset="utf-8">
<head>  
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

  <title>会計管理システム</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/logo-nav.css" rel="stylesheet">

</head>
<body>
<!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                  
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                 　　　<li>
                        <a href="student/studentMenu.jsp">メニュー</a>
                    </li>
                    <li>
                        <a href="./NewRequestMenuServlet">新規購入依頼</a>
                    </li>
                    <li>
                        <a href="./PurchaseRequestServlet">購入依頼一覧</a>
                    </li>
                    <li>
                        <li><a href="./NewReportMenuServlet">購入報告</a>
                    </li>
                    <li>
                        <li><a href="./PurchaseReportServlet">購入物品一覧</a>
                    </li>
                    <li>
                     <li><a href="./AccountingReportServlet">会計報告</a>
                    </li>
                    <li>
                        <li><a href="./LogoutServlet">ログアウト</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
 

  <div class="container">
        <div class="row">
            <div class="col-lg-12">
               <form action="./EditReportServlet?role=1" method="post">
   <i class="fa fa-bars" id="show"></i>

<h1>購入報告一覧</h1>
   <div class="container" style="padding:20px 0">
     <table class="table table-striped table-bordered table-hover table-condensed">
       <thead>
         <tr>
         <th>/</th>
         <th>日付</th>
         <th>氏名</th>
         <th>購入物品</th>
         <th>購入物品の種類</th>
         <th>数量</th>
         <th>金額</th>
         <th>コメント</th>
         <th>返金済み</th>
         </tr>
       </thead> 
       <tbody>
         <% while(spendingList.isEmpty() == false){ %>
    <% Spending spending= (Spending)spendingList.pop();%>
     <TR>
     <TD><input type="radio" name="spending" value=<%=spending.getSpending_number() %>  required></TD>
  <TD><%=spending.getDate() %></TD>
  <TD><%=spending.getUser_name() %></TD>
  <TD><%=spending.getProduct_name() %></TD>
  <TD><%=spending.getCategory_name()  %></TD>
  <TD><%=spending.getCount()  %></TD>
  <TD><%=spending.getPrice()  %></TD>
  <TD><%=spending.getComment() %></TD>
  <TD><%if(spending.getRefund() == 0) %> まだ返金されていません
  	  <%if(spending.getRefund() == 1) %> 返金されました
</TD>
     </TR>    
   <% } %>
       </tbody>
     </table>
    </div>
<p>
<center>

<input type="submit" name="type" value="edit" >
<input type="submit" name="type" value="delete" >
</div>

</div>
</div>


</center></p>
</form>
</body>
</html>
