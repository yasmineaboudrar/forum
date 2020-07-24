package commentaire;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class CommentaireController
 */
@WebServlet(urlPatterns = { "/ajouter", "/supprimer", "/modifier" })
public class CommentaireController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	CommentaireService commentaireservice = new CommentaireService();
    /**
     * Default constructor. 
     */
    public CommentaireController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getServletPath().toLowerCase().equals("/modifier")) {
			request.getRequestDispatcher("/modificationCommentaire.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/ajouter")) {
			request.getRequestDispatcher("/ajoutCommentaire.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/supprimer")) {
			request.getRequestDispatcher("/suppressionCommentaire.jsp").forward(request, response);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/modifier")) {
			if (request.getParameter("comment") != null ) {
				System.out.println("test0");
				try {
					Commentaire commentaire = commentaireservice.getCommentaire(request.getParameter("comment"));
					System.out.println(commentaire);
					if (commentaire != null) {
						HttpSession s = request.getSession();
						s.setAttribute("commentaire", commentaire);
						request.getRequestDispatcher("/home.jsp").forward(request, response);
					}
					else {
						request.setAttribute("err", true);
					    request.getRequestDispatcher("/modificationCommentaire.jsp").forward(request, response);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if (request.getServletPath().toLowerCase().equals("/ajouter")) {
			if (request.getParameter("comment") != null) {
				try {
				Commentaire c=new Commentaire(request.getParameter("comment"));
				commentaireservice.ajouterCommentaire(c);
					System.out.println(c);
				    request.getRequestDispatcher("/ajoutCommentaire.jsp").forward(request, response);

				} catch (Exception e) {
					request.setAttribute("err", true);
				    request.getRequestDispatcher("/home.jsp").forward(request, response);
				}
			}
		}
		
		
	}

}
