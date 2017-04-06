<%-- 
    Document   : objetosImplicitos
    Created on : Apr 6, 2017, 1:35:11 AM
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
        <h1>Objetos implícitos da linguagem de expressão </h1>

        <h2>Exemplo de alguns objetos implícitos</h2>
        <p>Obtendo um valor de um parâmetro do objeto de requisição: ${param['nome']}</p>
        <p>Obtendo o cabeçalho da requisição ${header['host']} </p>

        <h2>Operadores Aritiméticos</h2>
        1 + 1 é: ${ 1+ 1 } </br>
        3 dividido por 3 é: ${3 div 3} sem operador: ${3 / 3}
         
        
        <h2>Operadores Lógicos e Relacionais</h2>
        Idade é maior que 18! (retorna False ou True) ${param['idade']}: 
        ${param['idade'] >= 18 } </br>
        Idade é maior que 18 e menor que 22 (operador relacional &&): 
        ${param['idade'] >= 18 && param['idade'] <= 22}

        <h2>Operador Empty</h2>
        devolve verdadeiro se um argumento for null 
        ${ empty param['nome'] }


    </body>
</html>
