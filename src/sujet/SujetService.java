package sujet;

import javax.transaction.Transaction;

import org.hibernate.Session;


import com.forme.connexion.Connection;



public class SujetService {

	Session session = null;
	
	public SujetService() {
		session = Connection.getSession();
	}
	
	
	public void ajouterSujet(Sujet Sujet) {
		try {

			Transaction tx = (Transaction) session.beginTransaction();
			session.save(Sujet);
			tx.commit();
		} catch (Exception e) {
			System.err.println("impossible il'y a une ereur:" + e.getMessage());
		}
	}
	
	
	public Sujet getSujet(String le_sujet) throws Exception {
		try {
			Sujet Sujet = (Sujet) session.createQuery("from Sujet where sujet='" + le_sujet +  "'")
					.getSingleResult();

			if (Sujet != null) {
				return Sujet;
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
}
