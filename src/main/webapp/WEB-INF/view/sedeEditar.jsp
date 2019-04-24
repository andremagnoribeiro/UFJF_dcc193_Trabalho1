<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Formulario</title>
</head>
<body>
    <h1>Formulario</h1>
    <form action="sedeSalvar.html" method="post">
        <input type="hidden" name="idsede" value="${sede.id}"/>
        <label>Nome Fantasia: <input type="text" name="nomeFantasia" value=${sede.nomeFantasia} > </label><br/>
        <label>Estado da Federação: <input type="text" name="estadoDaFederacao" value=${sede.estadoDaFederacao}> </label><br/>
        <label>Cidade: <input type="text" name="cidade" value=${sede.cidade}> </label><br/>
        <label>Bairro: <input type="text" name="bairro" value=${sede.bairro}> </label><br/>
        <label>Telefone: <input type="text" name="telefone" value=${sede.telefone}> </label><br/>
        <label>Email: <input type="text" name="email" value=${sede.email}> </label><br/>
        <input type="submit">
    </form>
</body>
</html>