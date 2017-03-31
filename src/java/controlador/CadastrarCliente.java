/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC1
 */
public class CadastrarCliente extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        Cliente cli = new Cliente(nome);        
        request.setAttribute("cliente", cli);

        RequestDispatcher despachador;
        if (!nome.equals("") && !idade.equals("") ) {
            cli.setIdade(Integer.parseInt(idade));
            despachador = request.getRequestDispatcher("sucesso");
            despachador.forward(request, response);

        } else {
            despachador = request.getRequestDispatcher("incompleto");
            despachador.forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
