<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.RequestOder" %>
<%@ page import= "java.util.Stack" %>
<%@ include file="menu.jsp" %>
<%@ include file="include.jsp" %>

<%
Stack requestOderList =  (Stack)request.getAttribute("requestList");
%>

<HTML>
<head>
<title>購入依頼リスト</title>
<style type ="text/css">
</style>
</head>
<style>

body {

  font-size: 18px;
  background-color:#ECF0F1;
}


</style>


<SCRIPT language="JavaScript">
</SCRIPT>
<div align="center">

</div>
<br>
<br>
<br>
<br>
<br>
<center>
<h1>購入依頼リスト </h1>
</center>
<br>
<div align="center">

</div>
</BODY>

<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Ubuntu" />
<font face="游ゴシック">
<div class="container">
    <div class="row">
         <div class="brand">
         </div>
            <ul class="list-group">
            
 <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
          <tr>
          <th>日付</th>
          <th>依頼者</th>
          <th>依頼書籍</th>
          <th>購入物品の種類</th>
          <th>コメント</th>
          </tr>
        </thead>
        <tbody>
          <% while(requestOderList.isEmpty()==false){ %>
     <% RequestOder requestOder= (RequestOder)requestOderList.pop();%>
      <TR>
   <TD><li class="list-group-item"><%=requestOder.getDate() %></li></TD>
   <TD><li class="list-group-item"><%=requestOder.getUser_name() %></li></TD>
   <TD><li class="list-group-item"><%=requestOder.getRequest_name()%></li></TD>
   <TD><li class="list-group-item"><%=requestOder.getCategory()  %></li></TD>
   <TD><li class="list-group-item"><%=requestOder.getComment() %></TD>
      </TR>    
    <% } %>
        </tbody>
      </table>                
                 
            </ul>
        </div>
</div>
</font>
</HTML>