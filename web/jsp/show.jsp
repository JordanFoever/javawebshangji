<%--<%@ page import="javax.websocket.Session" %>&lt;%&ndash;--%>
  Created by IntelliJ IDEA.
  User: win
  Date: 2022/4/7
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    String name1 =(String) request.getAttribute("name1");
//    String name2 = (String) session.getAttribute("name2");
//    String name3 = (String) application.getAttribute("name3");

    pageContext.setAttribute("name4","Java 开发工程师");  //为当前的页面有校
//    String name4 =(String) pageContext.getAttribute("name4");
%>

从pageContext对象取值${pageScope.name4}<br>
从requestd对象取值${requestScope.name1}<br>
从session对象取值${sessionScope.name2}<br>
从application对象取值${applicationScope.name3}<br>

pageContext对象获取项目上下文路径:${pageContext.request.contextPath}


</body>
</html>
