<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2022/4/7
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" buffer="0kb" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    下面的这个是带缓存的   //    buffer=0kb就是让缓存为空,为空就会先输出下面的
    out.println("first line<br />");
    PrintWriter printWriter = response.getWriter();


//    下面的这个是不带缓存的
    printWriter.println("second lin<br />");
%>
</body>
</html>
