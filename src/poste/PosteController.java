package poste;


import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class PosteController
 */
@WebServlet(urlPatterns = { "/supprimerP", "/modifierP", "/ajouterP" })
public class PosteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	PosteService posteservice = new PosteService();
	
    /**
     * Default constructor. 
     */
    public PosteController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/ajouterP")) {
			request.getRequestDispatcher("/ajouterPOSTE.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/modifierP")) {
			request.getRequestDispatcher("/modifierPOSTE.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/supprimerP")) {
			request.getRequestDispatcher("/supprimerPOSTE.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			if (request.getServletPath().toLowerCase().equals("/modifierP")) {
				if (request.getParameter("poste") != null && request.getParameter("date") != null) {
					System.out.println("test0");
					try {
						Poste poste = posteservice.getPoste(request.getParameter("poste"), request.getParameter("date"));
						System.out.println(poste);
						if (poste != null) {
							HttpSession s = request.getSession();
							s.setAttribute("poste", poste);
							request.getRequestDispatcher("/home.jsp").forward(request, response);
						}
						else {
							request.setAttribute("err", true);
						    request.getRequestDispatcher("/modifierPOSTE.jsp").forward(request, response);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				if (request.getServletPath().toLowerCase().equals("/ajouterP")) {
					if (request.getParameter("poste") != null) {
						try {
						Poste p = new Poste(request.getParameter("poste"));
						posteservice.ajouterPoste(p);
							System.out.println(p);
						    request.getRequestDispatcher("/home.jsp").forward(request, response);

						} catch (Exception e) {
							request.setAttribute("err", true);
						    request.getRequestDispatcher("/ajouterPOSTE.jsp").forward(request, response);
						}
					}
				}
				
				
			}
	}

}
