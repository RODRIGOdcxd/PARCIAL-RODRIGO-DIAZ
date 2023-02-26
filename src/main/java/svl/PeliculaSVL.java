package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class PeliculaSVL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PeliculaSVL() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		Object data = null;
		if ( id != null ) { if ( id.equals("cartelera") || id.equals("estrenos") ) {
			data = new dao.PeliculasDAO().getPeliculas( id.equals("cartelera") ? 1 : 2);}
			else data = new dao.PeliculasDAO().getPelicula(Integer.parseInt(id));
			session.setAttribute("id", data == null ? null : id.equals("cartelera") || id.equals("estrenos"));
			session.setAttribute("data", data);
		}
		
		response.sendRedirect("index.jsp");
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
