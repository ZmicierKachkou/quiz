<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="/pages/error.jsp" %>
<%@ taglib uri="/tags/results.tld" prefix="res" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">
    <h3>Итоги</h3>
    <res:results answers="${answers}">Настало время подвести итоги!</res:results>
    <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit">Уууу!</button>
    </form>
</div>
</body>
</html>
