<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Listagem do somatorio das atividades de cada Sede</title>
</head>

<body>
    <h1>Listagem do somatorio das atividades de cada Sede</h1>
    <a href="/">Home</a></br>
    <ol>
        <c:forEach var="sede" items="${sedes}">
            <div>
            <li value="${sede.id}">Nome Fantasia: ${sede.nomeFantasia} Somatorio Das Atividades: ${somatorio} </li>
            </div>
        </c:forEach>
    </ul>
</body>

</html>