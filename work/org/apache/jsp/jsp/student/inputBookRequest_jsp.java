/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-12-06 10:41:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import beans.User;

public final class inputBookRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/student/include.jsp", Long.valueOf(1480522187000L));
    _jspx_dependants.put("/jsp/student/menu.jsp", Long.valueOf(1480693157000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("    <script\n");
      out.write("        src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("    <script\n");
      out.write("        src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Bootstrap CDN -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
      out.write('\n');
	HttpSession session1 = ((HttpServletRequest)request).getSession();
User user = (User) session1.getAttribute("user"); 
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/PurchaseOrder/jsp/css/menu.css\" media=\"all\">\n");
      out.write("<body>\n");
      out.write("<div class=\"menu\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a href=\"/PurchaseOrder/jsp/student/studentMenu.jsp\">購入依頼システム</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t    <li><a href=\"/PurchaseOrder/jsp/PurchaseRequestServlet\">購入依頼一覧</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/PurchaseOrder/jsp/LogoutServlet\"><span class=\"glyphicon glyphicon-log-out\"></span>　ログアウト</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</head>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<head>\n");
      out.write("<title>購入依頼システム</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("\n");
      out.write("  <!-- Latest compiled and minified CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("  <!-- Optional theme -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/PurchaseOrder/jsp/css/menu.css\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h2 class=\"text-center page-header\">購入依頼</h2>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<FORM  class=\"form-horizontal\" method=\"POST\" action=\"../CheckRequestServlet\">\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"col-sm-2 control-label\">書籍名</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("          <input type=\"text\" placeholder=\"書籍名\" maxlength='20' name=\"request_name\"  class=\"form-control\"  required/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"col-sm-2 control-label\">著者名</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("          <input type=\"text\" placeholder=\"著者名\"  maxlength='20' name=\"author\"  class=\"form-control\"  required/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"col-sm-2 control-label\">分類</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("          <select name=\"category\"  required>\n");
      out.write("            <option value=\"3\" >情報一般</option>\n");
      out.write("\t\t\t<option value=\"4\">ハードウェア</option>\n");
      out.write("\t\t\t<option value=\"5\">OS</option>\n");
      out.write("\t\t\t<option value=\"6\">言語</option>\n");
      out.write("\t\t\t<option value=\"7\">アプリケーション</option>\n");
      out.write("\t\t\t<option value=\"8\">情報通信/インターネット</option>\n");
      out.write("\t\t\t<option value=\"9\">情報科学</option>\n");
      out.write("\t\t\t<option value=\"10\">コンピュータ資格試験</option>\n");
      out.write("\t\t\t<option value=\"11\">その他</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label class=\"col-sm-2 control-label\">出版年月日</label>\n");
      out.write("        <div class=\"col-sm-10\"> <input type=\"date\" name=\"published_date\" >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("        <label class=\"col-sm-2 control-label\">コメント</label>\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("          <input type=\"text\" placeholder=\"ex)なんで購入したいのか？\"  name=\"comment\"  maxlength='50'    class=\"form-control\"  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("<button  type=\"submit\" class=\"btn-change2\">確認へ</button>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</FORM><font color=\"red\">\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("</font>\n");
      out.write("</body>\n");
      out.write("</HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
