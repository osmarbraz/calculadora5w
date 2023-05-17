package calculadora;

import java.io.IOException;
import javax.servlet.ServletException;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestCtrlCalculadora {

    @Test
    void testGetAdicao() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("4");
        when(mockedRequest.getParameter("ValorB")).thenReturn("2");
        when(mockedRequest.getParameter("operacao")).thenReturn("adicao");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertTrue(resultado.contains("4.0 + 2.0 = 6.0"));
    }
    
    @Test
    void testGetAdicaoNaoNumeroValorA() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("A");
        when(mockedRequest.getParameter("ValorB")).thenReturn("2");
        when(mockedRequest.getParameter("operacao")).thenReturn("adicao");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertFalse(resultado.contains("4.0 + 2.0 = 6.0"));
    }
    
    @Test
    void testGetAdicaoNaoNumeroValorB() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("4");
        when(mockedRequest.getParameter("ValorB")).thenReturn("A");
        when(mockedRequest.getParameter("operacao")).thenReturn("adicao");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertFalse(resultado.contains("4.0 + 2.0 = 6.0"));
    }

    @Test
    void testGetSubtracao() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("4");
        when(mockedRequest.getParameter("ValorB")).thenReturn("2");
        when(mockedRequest.getParameter("operacao")).thenReturn("subtracao");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertTrue(resultado.contains("4.0 - 2.0 = 2.0"));
    }

    @Test
    void testGetProduto() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("4");
        when(mockedRequest.getParameter("ValorB")).thenReturn("2");
        when(mockedRequest.getParameter("operacao")).thenReturn("produto");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertTrue(resultado.contains("4.0 * 2.0 = 8.0"));
    }

    @Test
    void testGetDivisao() throws IOException, ServletException {

        HttpServletRequest mockedRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = mock(HttpServletResponse.class);
        ServletContext mockedServletContext = mock(ServletContext.class);
        HttpSession mockedSession = mock(HttpSession.class);
        doReturn(mockedServletContext).when(mockedRequest).getServletContext();

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(mockedResponse.getWriter()).thenReturn(writer);

        when(mockedRequest.getParameter("ValorA")).thenReturn("4");
        when(mockedRequest.getParameter("ValorB")).thenReturn("2");
        when(mockedRequest.getParameter("operacao")).thenReturn("divisao");
        when(mockedRequest.getSession()).thenReturn(mockedSession);

        CtrCalculadora ctrlcalculadora = new CtrCalculadora();
        ctrlcalculadora.doPost(mockedRequest, mockedResponse);

        String resultado = stringWriter.toString();

        assertTrue(resultado.contains("4.0 / 2.0 = 2.0"));
    }
    
    @Test
    public void testDoPostIOException() throws ServletException, IOException {
        // Configuração do objeto mock do HttpServletRequest
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

        // Configuração do objeto mock do HttpServletResponse que lança IOException
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        Mockito.when(response.getWriter()).thenThrow(new IOException("Simulando IOException"));

        // Execução do método doPost()
        CtrCalculadora ctrCalculadora = new CtrCalculadora();

        try {
            //Chama o método para lançar exceção.
            ctrCalculadora.doPost(request, response);            
        } catch (IOException e) {
            assertEquals("Simulando IOException", e.getMessage());
        }
    }
}
