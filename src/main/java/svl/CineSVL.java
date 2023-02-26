package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;

public class CineSVL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CineSVL() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		dao.CineDAO daoCine = new dao.CineDAO();
		
		Object idCine = request.getParameter("idCine");
		if (idCine ==null) {
			String[][] iCines = daoCine.getVerCines();
			session.setAttribute("id", iCines == null ? null : "3");
			session.setAttribute("iCines", iCines);
		}else {
			String[] aCine = daoCine.getCine(idCine);
			session.setAttribute("id", aCine == null ? null : "4");
			session.setAttribute("aCine", aCine);
			session.setAttribute("mTarifas", daoCine.getCineTarifas(idCine));
			session.setAttribute("mPeliculas", daoCine.getCinePeliculas(idCine));
		}
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
