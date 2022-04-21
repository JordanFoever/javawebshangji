<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2022/4/14
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:out value="hdkahdska"></c:out>

<%--1.--%>
    <c:out value="${param.username}" default="weo" escapeXml="true"></c:out>

<%--&lt;%&ndash;    当value为空的情况下&ndash;%&gt; escapeXml默认是true--%>
    <c:out value="${param.username}" default="weo" escapeXml="true">
        <h2>用户名没有输出</h2>
    </c:out>


<%--    为false的话就会解析--%>
    <c:out value="${param.username}" default="weo" escapeXml="false">
        <h2>用户名没有输出</h2>
    </c:out>



</body>
</html>

