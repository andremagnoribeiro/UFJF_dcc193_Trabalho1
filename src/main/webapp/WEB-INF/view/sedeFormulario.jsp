<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>EXEM02: Formulario</title>
</head>
<body>
    <h1>EXEM02: Formulario</h1>
    <form action="sedeNova.html" method="post">
        <label>Nome Fantasia: <input type="text" name="nomeFantasia" > </label><br/>
        <label>Estado da Federação: <input type="text" name="estadoDaFederacao"> </label><br/>
        <label>Cidade: <input type="text" name="cidade"> </label><br/>
        <label>Bairro: <input type="text" name="bairro"> </label><br/>
        <label>Telefone: <input type="text" name="telefone"> </label><br/>
        <label>Email: <input type="text" name="email"> </label><br/>
        <input type="submit">
    </form>
</body>
</html>