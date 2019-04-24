<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <select name="sedeId"> 
            <c:forEach var="sede" items="${sedes}">  
                <option value="${sede.id}">${sede.nomeFantasia}</option>  
            </c:forEach>  
        </select></br>
        <label>Titulo: <input type="text" name="titulo" > </label><br/>
        <label>Descrição: <input type="text" name="descricao"> </label><br/>
        <label>Data de Inicio: <input type="text" name="dataInicio"> </label><br/>
        <label>Data de Fim: <input type="text" name="dataFim"> </label><br/>
        <label>Horas Assistencial: <input type="text" name="horasAssistencial"> </label><br/>
        <label>Horas Juridica: <input type="text" name="horasJuridica"> </label><br/>
        <label>Horas Financeira: <input type="text" name="horasFinanceira"> </label><br/>
        <label>Horas Executiva: <input type="text" name="horasExecutiva"> </label><br/>
        
        <input type="submit">
    </form>
</body>
</html>