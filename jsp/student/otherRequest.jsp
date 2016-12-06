<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file="include.jsp" %>
<%@ include file= "menu.jsp" %>


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


<br>
<br>
<br>
<br>
<h2 class="text-center page-header">購入依頼</h2>

<br>

<FORM  class="form-horizontal" method="POST" action="../CheckRequestServlet">

<div class="container">

    <div class="form-group">
        <label class="col-sm-2 control-label">購入したい物</label>
        <div class="col-sm-10">
          <input type="text" placeholder="書籍名" maxlength='20' name="request_name"  class="form-control"  required/>
        </div>
      </div>
       

      <div class="form-group">
        <label class="col-sm-2 control-label">分類</label>
        <div class="col-sm-10">
          <select name="category"  required>
            <option value="3" >情報一般</option>
			<option value="4">ハードウェア</option>
			<option value="5">OS</option>
			<option value="6">言語</option>
			<option value="7">アプリケーション</option>
			<option value="8">情報通信/インターネット</option>
			<option value="9">情報科学</option>
			<option value="10">コンピュータ資格試験</option>
			<option value="11">その他</option>
          </select>
        </div>
      </div>
      

       <div class="form-group">
        <label class="col-sm-2 control-label">詳細</label>
        <div class="col-sm-10">
          <input type="text" placeholder="ex)なんで購入したいのか？"  name="comment"  maxlength='50'    class="form-control"  >
        </div>
      </div>


    </form>
<button  type="submit" class="btn-change2">確認へ</button>

</div>
</FORM><font color="red">
${error}
</font>
</body>
</HTML>