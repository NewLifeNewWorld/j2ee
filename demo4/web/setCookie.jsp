<%--
  Created by IntelliJ IDEA.
  User: YANGYEDONG
  Date: 2019/11/7
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie c = new Cookie("name", "Gareen");
    c.setMaxAge(24 * 60 * 60);
    c.setPath("/");
    response.addCookie(c);
%>


<a href="getCookie.jsp">跳转到获取cookie的页面</a>
</body>
</html>
