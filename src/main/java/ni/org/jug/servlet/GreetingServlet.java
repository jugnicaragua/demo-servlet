package ni.org.jug.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(urlPatterns = "/saludo", 
			name = "GreetingServlet", 
			initParams = {@WebInitParam(name="nombre-defecto", value = "Mr. Duke")})
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre") == null ? getInitParameter("nombre-defecto") : request.getParameter("nombre");
		response.getWriter().append("<h1>Bienvenido "+nombre+" </h1>");
		response.getWriter().append("Mi primer Servlet desde :").append(request.getContextPath());
	}

}
