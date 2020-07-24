package user;

import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/login", "/logout", "/inscrir" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userservice = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/login")) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		if (request.getServletPath().toLowerCase().equals("/inscrir")) {
			request.getRequestDispatcher("/singup.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getServletPath().toLowerCase().equals("/login")) {
			if (request.getParameter("email") != null && request.getParameter("password") != null) {
				System.out.println("test0");
				try {
					User user = userservice.getUser(request.getParameter("email"), request.getParameter("password"));
					System.out.println(user);
					if (user != null) {
						HttpSession s = request.getSession();
						s.setAttribute("user", user);
						request.getRequestDispatcher("/home.jsp").forward(request, response);
					}
					else {
						request.setAttribute("err", true);
					    request.getRequestDispatcher("/login.jsp").forward(request, response);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if (request.getServletPath().toLowerCase().equals("/inscrir")) {
			if (request.getParameter("email") != null && request.getParameter("password") != null) {
				try {
				User u=new User(request.getParameter("username"),request.getParameter("email"), request.getParameter("password"));
				userservice.ajouterUser(u);
					System.out.println(u);
				    request.getRequestDispatcher("/login.jsp").forward(request, response);

				} catch (Exception e) {
					request.setAttribute("err", true);
				    request.getRequestDispatcher("/inscrir.jsp").forward(request, response);
				}
			}
		}
	}

}
