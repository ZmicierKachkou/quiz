<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="/tags/results.tld" prefix="res" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">
    <h3>ПРОВАЛ!!1</h3>

    <p>Ну вот! Вы всё сломали! Вылетело страшное ИСКЛЮЧЕНИЕ: <%= exception %>!</p>

    <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit">Я осознал свою неправоту</button>
    </form>
</div>
</body>
</html>