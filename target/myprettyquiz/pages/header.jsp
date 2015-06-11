<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 13.04.2015
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<head>
    <title>Невероятный тест про хурму</title>
    <style>
        <%@include file='/css/style.css' %>
    </style>
</head>
<div class="header">
    <ul>
        <li><a href="${pageContext.request.contextPath}">Главная</a></li>
        <li><a href="${pageContext.request.contextPath}/pages/about">О сайте</a></li>
        <li><a href="${pageContext.request.contextPath}/pages/photo" class="logo">
            <img src="${pageContext.request.contextPath}/pics/avatar.jpg">
        </a></li>
        <li><a href="${pageContext.request.contextPath}/pages/enlightenment">Просвещение</a></li>
        <li><a href="about:blank">Выход</a></li>
    </ul>
</div>
<div class="persimmon"
     style="background: url('${pageContext.request.contextPath}/pics/persimmon.jpg') no-repeat scroll 0 0 transparent;"></div>
