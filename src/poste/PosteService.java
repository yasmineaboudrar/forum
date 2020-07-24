package poste;

import org.hibernate.Session;


import java.sql.Date;

import javax.transaction.Transaction;

import com.forme.connexion.Connection;


public class PosteService {

	Session session = null;
	
	
	public PosteService() {
		session = Connection.getSession();
	}
	
	public void ajouterPoste(Poste Poste) {
		try {

			Transaction tx = (Transaction) session.beginTransaction();
			session.save(Poste);
			tx.commit();
		} catch (Exception e) {
			System.err.println("impossible il'y a une ereur:" + e.getMessage());
		}
	}
	

	public Poste getPoste(String poste, String date) throws Exception {
		try {
			Poste Poste = (Poste) session.createQuery("from Poste where nom_poste='" + poste + "and date='" + date + "'")
					.getSingleResult();

			if (Poste != null) {
				return Poste;
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
