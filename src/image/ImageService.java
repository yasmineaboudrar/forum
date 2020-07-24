package image;

import javax.transaction.Transaction;

import org.hibernate.Session;


import com.forme.connexion.Connection;


public class ImageService {

	
	Session session = null;
	
	
	public ImageService() {
		session = Connection.getSession();
	}
	
	public void ajouterImage(Image Image) {
		try {

			Transaction tx = (Transaction) session.beginTransaction();
			session.save(Image);
			tx.commit();
		} catch (Exception e) {
			System.err.println("impossible il'y a une ereur:" + e.getMessage());
		}
	}
	
	public Image getImage(String le_path) throws Exception {
		try {
			Image Image = (Image) session.createQuery("from Image where path='" + le_path +  "'")
					.getSingleResult();

			if (Image != null) {
				return Image;
			} else
				return null;
		} catch (Exception e) {
			return null;
		}
	}
	
}
