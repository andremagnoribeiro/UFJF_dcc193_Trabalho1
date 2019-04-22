<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>EXM01: Lista de Sedes</title>
</head>

<body>
    <h1>EXM01: Lista de Sedes</h1>
    <ol>
        <c:forEach var="sede" items="${sed}">
            <div>
            <li value="${sede.id}">Nome Fantasia: ${sede.nomeFantasia} </li>
            <a href="sedeList.html">Editar</a>
            <a href="sedeList.html?idsede=${sede.id}">Excluir</a>
            </div>
        </c:forEach>
    </ul>
</body>

</html>