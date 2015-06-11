<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="/tags/results.tld" prefix="res" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">
    <h3>Фото хурмы (18+)</h3>
    <table width="80%">
        <tr>
            <td style="text-align: center">
                <img src="${pageContext.request.contextPath}/pics/big-persimmon.jpg" height="160px">
            </td>
            <td style="text-align: center">
                <img src="${pageContext.request.contextPath}/pics/avatar.jpg" height="160px">
            </td>
            <td style="text-align: center">
                <img src="${pageContext.request.contextPath}/pics/persimmon2.jpg" height="160px">
            </td>
        </tr>
        <tr>
            <td style="text-align: center">
                <img src="${pageContext.request.contextPath}/pics/persimmon3.jpg" height="160px">
            </td>
            <td style="text-align: center">
                <img src="${pageContext.request.contextPath}/pics/persimmon4.jpg" height="160px">
            </td>
            <td style="text-align: center">
                А здесь могла быть ваша реклама.
            </td>
        </tr>
    </table>
    <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit">Вах!</button>
    </form>
</div>
</body>
</html>