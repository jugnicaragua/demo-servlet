package ni.org.jug.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String html = "<html><h3>Please login</h3></html>";
		resp.getWriter().write(html+" ");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/login-success.jsp");
		dispatcher.include(req, resp);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");

		if(isValid(username, password)) {
			redireccionarPaginaSatisfactoria(request, response);
		}else {
			redireccionarLogin(request, response);
		}
	}

	public void redireccionarPaginaSatisfactoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/view/login-success.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.include(request, response);
	}
	
	public void redireccionarLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/view/login.jsp";
		String errorMessage = "Credenciales Invalidas, por favor intentelo nuevamente ";
		request.setAttribute("error", errorMessage);
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	public boolean isValid(String username, String password) {
		return "fbriceno".equals(username) && "123".equals(password);
	}
}
