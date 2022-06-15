package calculadora;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CtrCalculadora extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><title>Calculadora</title></head><body>");
            out.println("<h1>Calculadora</h1>");
            
            // Instancia o objeto Calculadora
            Calculadora calculadora = new Calculadora();
            calculadora.setValorA(Double.parseDouble(request.getParameter("ValorA")));
            calculadora.setValorB(Double.parseDouble(request.getParameter("ValorB")));
            
            if (request.getParameter("operacao").equals("adicao")) {
                System.out.println("aqui somando daçsdfçlkajsdf");
                out.print("A adição de " + calculadora.getValorA() + " + " + calculadora.getValorB() + " = " + calculadora.getAdicao() + " <p>");
            } else {
                if (request.getParameter("operacao").equals("subtracao")) {
                    out.print("A subtração de " + calculadora.getValorA() + " - " + calculadora.getValorB() + " = " + calculadora.getSubtracao() + " <p>");
                } else {
                    if (request.getParameter("operacao").equals("produto")) {
                        out.print("O produto " + calculadora.getValorA() + " * " + calculadora.getValorB() + " = " + calculadora.getProduto() + " <p>");
                    } else {
                        if (request.getParameter("operacao").equals("divisao")) {
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
    }
}
