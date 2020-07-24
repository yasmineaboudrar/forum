package image;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ImageController
 */
@WebServlet(urlPatterns = { "/ajouterI", "/supprimerI", "/modifierI" })
public class ImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	ImageService imageservice = new ImageService();
    /**
     * Default constructor. 
     */
    public ImageController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/ajouterI")) {
			request.getRequestDispatcher("/ajouterImage.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/supprimerI")) {
			request.getRequestDispatcher("/supprimerImage.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/modifierI")) {
			request.getRequestDispatcher("/modifierImage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (request.getServletPath().toLowerCase().equals("/modifierI")) {
			if (request.getParameter("path") != null ) {
				System.out.println("test0");
				try {
					Image image = imageservice.getImage(request.getParameter("path"));
					System.out.println(image);
					if (image != null) {
						HttpSession s = request.getSession();
						s.setAttribute("image", image);
						request.getRequestDispatcher("/modifierImage.jsp").forward(request, response);
					}
					else {
						request.setAttribute("err", true);
					    request.getRequestDispatcher("/ajouterImage.jsp").forward(request, response);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		if (request.getServletPath().toLowerCase().equals("/ajouterI")) {
			if (request.getParameter("path") != null ) {
				try {
				Image i=new Image(request.getParameter("path"));
				imageservice.ajouterImage(i);
					System.out.println(i);
				    request.getRequestDispatcher("/home.jsp").forward(request, response);

				} catch (Exception e) {
					request.setAttribute("err", true);
				    request.getRequestDispatcher("/ajouterImage.jsp").forward(request, response);
				}
			}
		}
	}

}
