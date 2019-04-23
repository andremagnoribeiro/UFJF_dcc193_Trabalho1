<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Lista de Sedes</title>
</head>

<body>
    <h1>Lista de Sedes</h1>
    <a href="/">Home</a></br>
    <a href="sedeForm.html">Criar nova Sede</a>
    <ol>
        <c:forEach var="sede" items="${sedes}">
            <div>
            <li value="${sede.id}">Nome Fantasia: ${sede.nomeFantasia} </li>
            <a href="sedeList.html">Editar</a>
            <a href="sedeList.html?idsede=${sede.id}">Excluir</a>
            </div>
        </c:forEach>
    </ul>
</body>

</html>