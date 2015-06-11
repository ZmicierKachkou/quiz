<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="/tags/results.tld" prefix="res" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">
    <h3>Сын мой!</h3>

    <p>Чтобы понять хурму, ты должен думать как хурма!</p>

    <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit">Спасибо, учитель, это изменит мою жизнь</button>
    </form>
</div>
</body>
</html>