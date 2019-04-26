<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/4/25
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <h1>Hello World!</h1>
  <a href="/homework/HelloServlet">getTest</a>
  <form method="post" action="/homework/HelloServlet" id="postTest">
    <table>
      <tr>
        <td>用户名：</td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" value="登录"></td>
      </tr>
    </table>
  </form>
  <br>
  <br>
  <a href="/homework/HelloServlet" onclick="document.getElementById('postTest').submit();return false;">测试a标签提交表单</a>
  </body>
</html>
