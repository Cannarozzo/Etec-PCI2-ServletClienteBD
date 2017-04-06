<%-- 
    Document   : mostra-cliente
    Created on : Apr 6, 2017, 12:17:30 AM
    Author     : PC1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dados do cliente cadastrado</h1>
        <table border="1">
            <tr>
                <td>Nome: ${cliente.nome}</td><td>Idade: ${cliente.idade}</td>
            </tr>
        </table>
    </body>
</html>
