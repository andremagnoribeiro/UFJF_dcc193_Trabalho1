<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Editar Atividade</title>
</head>
<body>
    <h1>Editar membro</h1>
    <form action="mSalvar.html" method="post">
        <input type="hidden" name="id" value="${membro.id}"/>
        <label>Nome: <input type="text" name="nome" value="${membro.nome}" > </label><br/>
        <label>Função: <input type="text" name="funcao" value="${membro.funcao}"> </label><br/>
        <label>Email: <input type="text" name="email" value="${membro.email}"> </label><br/>
        <label>Data de Entrada: <input type="text" name="dataEntrada" value="${membro.dataEntrada}"> </label><br/>
        <label>Data de Saida: <input type="text" name="dataSaida" value="${membro.dataSaida}"> </label><br/>
        <input type="submit">
    </form>
</body>
</html>