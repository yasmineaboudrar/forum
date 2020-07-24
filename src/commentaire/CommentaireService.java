package commentaire;


import javax.transaction.Transaction;

import org.hibernate.Session;


import com.forme.connexion.Connection;

import commentaire.Commentaire;

public class CommentaireService {

	Session session = null;
	
	
	public CommentaireService() {
		session = Connection.getSession();
	}
	
	public void ajouterCommentaire(Commentaire Commentaire) {
		try {

			Transaction tx = (Transaction) session.beginTransaction();
			session.save(Commentaire);
			tx.commit();
		} catch (Exception e) {
			System.err.println("impossible il'y a une ereur:" + e.getMessage());
		}
	}
	
	
	public Commentaire getCommentaire(String commentaire) throws Exception {
		try {
			Commentaire Commentaire = (Commentaire) session.createQuery("from Commentaire where comment='" + commentaire +  "'")
					.getSingleResult();

			if (Commentaire != null) {
				return Commentaire;
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
