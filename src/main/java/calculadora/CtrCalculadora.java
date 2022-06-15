package calculadora;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CtrCalculadora extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(CtrCalculadora.class.getName());

    private static final long serialVersionUID = 1L;

    private static final String OPERACAO = "operacao";

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            response.setContentType("text/html");

            try ( PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html><html lang=\"pt-br\" xml:lang=\"pt-br\">");
                out.println("<html><head><title>Calculadora</title></head><body>");
                out.println("<h1>Calculadora</h1>");

                // Instancia o objeto Calculadora
                Calculadora calculadora = new Calculadora();
                try{
                    calculadora.setValorA(Double.parseDouble(request.getParameter("ValorA")));
                } catch (NumberFormatException e) {
                    LOGGER.log(Level.SEVERE, "Problema de conversão do valor A {0}", e.toString());
                }
                try{
                    calculadora.setValorB(Double.parseDouble(request.getParameter("ValorB")));
                } catch (NumberFormatException e) {
                    LOGGER.log(Level.SEVERE, "Problema de conversão do valor B {0}", e.toString());
                }

                if (request.getParameter(OPERACAO).equals("adicao")) {
                    out.print("A adição de " + calculadora.getValorA() + " + " + calculadora.getValorB() + " = " + calculadora.getAdicao() + " <p>");
                } else {
                    if (request.getParameter(OPERACAO).equals("subtracao")) {
                        out.print("A subtração de " + calculadora.getValorA() + " - " + calculadora.getValorB() + " = " + calculadora.getSubtracao() + " <p>");
                    } else {
                        if (request.getParameter(OPERACAO).equals("produto")) {
                            out.print("O produto " + calculadora.getValorA() + " * " + calculadora.getValorB() + " = " + calculadora.getProduto() + " <p>");
                        } else {
                            if (request.getParameter(OPERACAO).equals("divisao")) {
                                out.print("A divisão " + calculadora.getValorA() + " / " + calculadora.getValorB() + " = " + calculadora.getDivisao() + " <p>");
                            } else {
                                out.print("Operação inválida! <p>");
                            }
                        }
                    }
                }

                out.print("<a href=\"" + request.getContextPath() + "/FrmCalculadora.jsp\"> Novo cálculo </a><p>");

                out.println("</body></html>");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Problema E/S {0}", e.toString());
        }
    }
}
