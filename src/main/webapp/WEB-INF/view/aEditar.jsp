<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Editar Atividade</title>
</head>
<body>
    <h1>Editar atividade</h1>
    <form action="aSalvar.html" method="post">
        <input type="hidden" name="membroId" value="${atividade.id}"/>
        <label>Titulo: <input type="text" name="titulo" value="${atividade.titulo}"> </label><br/>
        <label>Descrição: <input type="text" name="descricao" value="${atividade.descricao}"> </label><br/>
        <label>Data de Inicio: <input type="text" name="dataInicio" value="${atividade.dataInicio}"> </label><br/>
        <label>Data de Fim: <input type="text" name="dataFim" value="${atividade.dataFim}"> </label><br/>
        <label>Horas Assistencial: <input type="text" name="horasAssistencial" value="${atividade.horasAssistencial}"> </label><br/>
        <label>Horas Juridica: <input type="text" name="horasJuridica" value="${atividade.horasJuridica}"> </label><br/>
        <label>Horas Financeira: <input type="text" name="horasFinanceira" value="${atividade.horasFinanceira}"> </label><br/>
        <label>Horas Executiva: <input type="text" name="horasExecutiva" value="${atividade.horasExecutiva}"> </label><br/>
        <input type="submit">
    </form>
</body>
</html>