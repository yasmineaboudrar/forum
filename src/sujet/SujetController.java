package sujet;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class SujetController
 * 
 */
@WebServlet(urlPatterns = {"/ajouterS", "/supprimerS" })
public class SujetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	SujetService sujetservice = new SujetService();
	
    /**
     * Default constructor. 
     */
    public SujetController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/ajouterS")) {
			request.getRequestDispatcher("/ajouterSUJET.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/supprimerS")) {
			request.getRequestDispatcher("/supprimerSUJET.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			if (request.getServletPath().toLowerCase().equals("/ajouterS")) {
				if (request.getParameter("sujet") != null) {
					System.out.println("test0");
					try {
						Sujet sujet = sujetservice.getSujet(request.getParameter("sujet"));
						System.out.println(sujet);
						if (sujet != null) {
							HttpSession s = request.getSession();
							s.setAttribute("sujet", sujet);
							request.getRequestDispatcher("/home.jsp").forward(request, response);
						}
						else {
							request.setAttribute("err", true);
						    request.getRequestDispatcher("/ajouterSUJET.jsp").forward(request, response);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			if (request.getServletPath().toLowerCase().equals("/supprimerS")) {
				if (request.getParameter("sujet") != null ) {
					try {
					Sujet s=new Sujet(request.getParameter("sujet"));
					sujetservice.ajouterSujet(s);
						System.out.println(s);
					    request.getRequestDispatcher("/home.jsp").forward(request, response);

					} catch (Exception e) {
						request.setAttribute("err", true);
					    request.getRequestDispatcher("/supprimerSUJET.jsp").forward(request, response);
					}
				}
			}
			
			
	}

}
