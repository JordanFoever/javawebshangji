<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: win
  Date: 2022/4/15
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="css/good-list.css"/>

        <title></title>
    </head>
<body>
<!-- 顶部 -->
<jsp:include page="header.jsp"></jsp:include>

<!--products-->
<div class="products">
    <div class="container">
        <h2>热销商品</h2>

        <div class="product-model-sec">

            <c:forEach items="${goodsList}"  var="list" varStatus="stauts" >
                <div class="product-grid">
                    <a href="/goods_detail?id=9">
                        <div class="more-product"><span> </span></div>
                        <div class="product-img">
                            <img src="${list.image1}" class="img-responsive" alt="${list.name}" width="240" height="240">
                        </div>
                    </a>
                    <div class="product-info ">
                        <div class="product-info-cust">
                            <h4>${list.name}</h4>
                            <span class="item_price">¥ ${list.price}</span>
                            <a href="#" class="item_add items">加入购物车</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <!--bootstrap的分页组件-->
        <div style="margin: 0 auto;width: 500px">
            <nav aria-label="Page navigation" >
                <ul class="pagination">
                    <!--标签li中class的值的含义
                    disabled : 禁用
                    active ：激活
                    -->
                    <li >
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">上一页</span>
                        </a>
                    </li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">下一页</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>

