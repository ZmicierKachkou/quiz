<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="/tags/results.tld" prefix="res" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">
    <h3>Ошибочка вышла</h3>

    <div style="float: right;" >— ... Нет, вы, к сожалению, ошиблись, это не прачечная, а Министерство культуры...</div><br /><br />

    <p>Доброго времени суток. Вы зашли куда-то не туда. Здесь вам не удасться постичь ни себя, ни хурму. Надеемся, такого больше
        не повторится, а не то нам придётся вас ликвидировать.</p>

    <form action="${pageContext.request.contextPath}/" method="get">
        <button type="submit">Я больше не буду</button>
    </form>
</div>
</body>
</html>