<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Lista de Atividades</title>
</head>

<body>
    <h1>Lista de Atividades</h1>
    <a href="/">Home</a></br>
    <a href="aForm.html">Criar nova Atividade</a>
    <ol>
        <c:forEach var="atividade" items="${atividades}">
            <div>
            <li value="${atividade.id}">Nome Fantasia: ${atividade.titulo} Sede: ${atividade.sedeId} </li></ol>
            <a href="aEditar.html?atividadeId=${atividade.id}">Editar</a>
            <a href="aExcluir.html?atividadeId=${atividade.id}">Excluir</a>
            </div>
        </c:forEach>
    </ul>
</body>

</html>