/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author PC1
 */
public class IncompletoForm extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         
         Cliente cliente = (Cliente)request.getAttribute("cliente");
         
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Erro! IncompletoForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Erro! Cadastro Incompleto</h1>");
            out.println("Os seguintes campos não foram preenchidos: ");
            out.println("<fieldset>");
            out.println("<font color=\"red\">");
            if( cliente.getNome().equals(""))
                out.println("Nome </br>");
            if( cliente.getIdade() == null)
                out.println("Idade");
            out.println("</font>");
            out.println("</fieldset>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
