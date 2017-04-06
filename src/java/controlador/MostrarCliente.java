/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author PC1
 */
@WebServlet(name = "MostrarCliente", urlPatterns = {"/cliente/MostrarCliente"})
public class MostrarCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");

        Cliente cli = new Cliente(nome);
        if(!idade.equals("")) // Para evitar status500 no servidor. Não da para fazer um parse para Int com um valor de string vazia. é necessário usar o método equals para comparar o valor da String e não sua referência de memória.
            cli.setIdade(Integer.parseInt(idade));
        
        request.setAttribute("cliente", cli);

        RequestDispatcher despachador;
        if (!nome.equals("") && !idade.equals("")) {
            cli.setIdade(Integer.parseInt(idade));
            despachador = request.getRequestDispatcher("/cliente/mostra.jsp");
            despachador.forward(request, response);
        } else {
            despachador = request.getRequestDispatcher("/cliente/dados-incompletos.jsp");
            despachador.forward(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
