<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="include.jsp" %>
<%@ include file="menu.jsp" %>
<%@ page import= "beans.RequestOder" %>
<%String request_name = (String)request.getAttribute("request_name");%> 
<%String author = (String)request.getAttribute("author");%> 
<%String category_name = (String)request.getAttribute("category_name");%> 
<%String published_date = (String)request.getAttribute("published_date");%> 
<%String comment = (String)request.getAttribute("comment");%> 


<HTML>
<head>
<title>購入依頼システム</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="/PurchaseOrder/jsp/css/menu.css" media="all">

</head>

<body>
<SCRIPT language="JavaScript">

</SCRIPT>

<br>
<br>
<br>
<h2 class="text-center page-header">購入依頼</h2>

<br>

<FORM class="form-horizontal" method="POST" action="./RegistRequestServlet">



    <div class="form-group">
        <label class="col-sm-2 control-label">書籍名</label>
        <div class="col-sm-10"> <%= request_name %>
        </div>
      </div>
      
      
      
      
      <div class="form-group">
        <label class="col-sm-2 control-label">著者名</label>
        <div class="col-sm-10"><%= author %>
        </div>
      </div>

      <div class="form-group">
        <label class="col-sm-2 control-label">分類</label>
        <div class="col-sm-10"><%= category_name  %>
        </div>
      </div>
      
       <div class="form-group">
        <label class="col-sm-2 control-label">出版年月日</label>
        <div class="col-sm-10"><%= published_date %> 
        </div>
      </div>


       <div class="form-group">
        <label class="col-sm-2 control-label">コメント</label>
        <div class="col-sm-10">  <%= comment %> 
        </div>
      </div>


<button  type="submit" class="btn-change1">送信</button>


</FORM><font color="red">
${error}
</font>
</body>
</HTML>