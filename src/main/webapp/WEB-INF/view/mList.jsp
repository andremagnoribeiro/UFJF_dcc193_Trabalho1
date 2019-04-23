<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Lista de Membros</title>
</head>

<body>
    <h1>Lista de Membros
    </h1>
    <a href="/">Home</a></br>
    <a href="mForm.html">Criar novo Membro</a>
    <ol>
        <c:forEach var="membro" items="${membros}">
            <div>
            <li value="${membro.id}">Nome: ${membro.nome} </li>
            <a href="aList.html">Editar</a>
            <a href="aExcluir.html">Excluir</a>
            </div>
        </c:forEach>
    </ul>
</body>

</html>