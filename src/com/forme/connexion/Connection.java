package com.forme.connexion;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import commentaire.Commentaire;
import image.Image;
import poste.Poste;

import sujet.Sujet;
import user.User;

public class Connection {
private  static  Session session=null ;

	private  Connection() {
}
	
	public static synchronized  Session getSession() {
		if (session==null) {
		final SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Poste.class)
				.addAnnotatedClass(Sujet.class)
				.addAnnotatedClass(Commentaire.class)
				.addAnnotatedClass(Image.class)
				.buildSessionFactory();
    	 session = factory.openSession();
    	 return session;
		}
		else  return session;

		
	}
}
