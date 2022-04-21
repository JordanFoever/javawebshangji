<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2022/3/25
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<link rel="stylesheet" href="css/style.css" />
<body>
<jsp:include page="header.jsp"></jsp:include>

<div  class="form-block">
    <form action="registerServlet" method="post">
        <div class="item">
            <span class="lab">用户名：</span><input class="txt" type="text" id="userid" name="username" placeholder="用户名">
        </div>
        <div class="item">
            <span class="lab">密码：</span><input class="txt" type="password" name="password" placeholder="密码">
        </div>
        <div class="item">
            <span class="lab">性别：</span>
            <div class="item-option">
                <input type="radio" name="gender" value="male">男 &nbsp;
                <input type="radio" name="gender" value="female">女<br>
            </div>
        </div>
        <div class="item">
            <span class="lab">爱好：</span>
            <div class="item-option">
                <input type="checkbox" name="hobby" value="篮球">篮球&nbsp;
                <input type="checkbox" name="hobby" value="围棋">围棋&nbsp;
                <input type="checkbox" name="hobby" value="射击">射击
            </div>
        </div>

        <div class="btn-block">
            <input class="btn" type="submit" value="注册">
            <input class="btn" type="reset" value="重置">
        </div>
    </form>

<%--    <%=request.getAttribute("message")%>--%>
    ${requestScope.message}

</div>

<jsp:include page="footer.jsp"></jsp:include>
<%--<div class="copy" >--%>
<%--    版权信息--%>
<%--</div>--%>

</body>
</html>
