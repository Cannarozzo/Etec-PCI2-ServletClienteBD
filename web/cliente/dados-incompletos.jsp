<%-- 
    Document   : dados-incompletos
    Created on : Apr 6, 2017, 12:21:46 AM
    Author     : PC1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
    </head>
    <body>
        <h1>Erro!</h1>
        <p style="color:red">${cliente.nome.equals("") ? "Erro Digite um nome válido" : "" }</p>
        <p style="color:red">${cliente.idade <= 0 || cliente.idade == null ? "Digite uma idade! E que seja maior que zero (0)" : "" }</p>
    </body>
</html>
    