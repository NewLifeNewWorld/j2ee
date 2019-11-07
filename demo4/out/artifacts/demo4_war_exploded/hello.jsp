<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: YANGYEDONG
  Date: 2019/11/7
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%--contentType="text/html;charset=UTF-8" 通知浏览器以UTF-8进行中文解码 --%>
<%--pageEncoding="UTF-8"  如果jsp文件中出现了中文，这些中文使用UTF-8进行编码--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  <%=new Date().toLocaleString()%>  输出当前时间，相当于在Servlet中使用response.getWriter()进行输出--%>
    <%
        List<String> words = new ArrayList<>();
        words.add("today");
        words.add("is");
        words.add("new");
        words.add("day");
    %>
    <table  width="200px" align="center" border="1" cellspacing="0" >
        <%
            for (String word:words){%>
            <tr>
                <td><%=word%></td>
            </tr>
        <%}%>
    </table>

    <jsp:include page="footer.jsp">
        <jsp:param name="year" value="2017"/>
    </jsp:include>
</body>
</html>
