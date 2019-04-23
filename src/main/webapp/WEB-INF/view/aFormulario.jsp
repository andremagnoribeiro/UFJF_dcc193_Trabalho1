<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Adiconar Atividade</title>
</head>
<body>
    <h1>Adicionar uma nova Atividade
    </h1>
    <form action="aNovo.html" method="post">
        <label>Titulo: <input type="text" name="titulo" > </label><br/>
        <label>Descrição: <input type="text" name="descricao"> </label><br/>
        <label>Data de Inicio: <input type="text" name="dataInicio"> </label><br/>
        <label>Data de Fim: <input type="text" name="dataFim"> </label><br/>
        <label>Horas Computadas: <input type="text" name="horasComputadas"> </label><br/>
        <input type="submit">
    </form>
</body>
</html>