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
        <h3>Вопрос №2</h3>

        <p>Вам оторвало голову пропеллером самолета. Как вы поступите?</p>
        <input class="radio" type="radio" id="radio-1" name="rd" value="first" checked>
        <label tabindex="4" for="radio-1" class="radio-label">Упадете на взлетное поле, обливаясь кровью;</label>
        <br/>
        <input class="radio" type="radio" id="radio-2" name="rd" value="second">
        <label tabindex="5" for="radio-2" class="radio-label">Смешно побежите прочь от самолета, размахивая руками,
            словно безголовая курица;</label>
        <br/>
        <input class="radio" type="radio" id="radio-3" name="rd" value="third">
        <label tabindex="6" for="radio-3" class="radio-label">Постараетесь сохранять спокойствие.</label>
        <br/>
        <input class="checkbox" type="checkbox" id="check" name="check" value="check">
        <label tabindex="6" for="check" class="checkbox-label">Не запоминать ответ (ничем хорошим это не закончится).</label>
        <br/>
        <button type="submit" name="command" value="third">Я всё обдумал</button>
    </form>
</div>
</body>
</html>
