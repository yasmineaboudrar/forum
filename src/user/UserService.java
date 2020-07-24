package user;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.forme.connexion.Connection;

public class UserService {
	Session session = null;

	public UserService() {
		session = Connection.getSession();
	}

	public void ajouterUser(User User) {
		try {

			Transaction tx = session.beginTransaction();
			session.save(User);
			tx.commit();
		} catch (Exception e) {
			System.err.println("impossible il'ya ereur:" + e.getMessage());
		}
	}

	public User getUser(String nom, String mdp) throws Exception {
		try {
			User User = (User) session.createQuery("from User where email='" + nom + "' and password='" + mdp + "'")
					.getSingleResult();

			if (User != null) {
				return User;
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}
}
