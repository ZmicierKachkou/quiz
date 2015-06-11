<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 13.04.2015
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<jsp:include page="/pages/header.jsp"/>
<div class="content">

    <form action="${pageContext.request.contextPath}/" method="post">
        <h3>Вопрос №4</h3>

        <p>У вас большие оттопыренные уши. Какой вариант ответа вы выберете?</p>
        <input class="radio" type="radio" id="radio-1" name="rd" value="first" checked>
        <label tabindex="4" for="radio-1" class="radio-label">Первый;</label>
        <br/>
        <input class="radio" type="radio" id="radio-2" name="rd" value="second">
        <label tabindex="5" for="radio-2" class="radio-label">Второй;</label>
        <br/>
        <input class="radio" type="radio" id="radio-3" name="rd" value="third">
        <label tabindex="6" for="radio-3" class="radio-label">Первый.</label>
        <br/>
        <input class="checkbox" type="checkbox" id="check" name="check" value="check">
        <label tabindex="6" for="check" class="checkbox-label">Не запоминать ответ (ничем хорошим это не закончится).</label>
        <br/>
        <button type="submit" name="command" value="results">Я всё обдумал</button>
    </form>
</div>
</body>
</html>
