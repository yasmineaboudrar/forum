package poste;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Poste")
public class Poste {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "int(255)")
	private Integer id_poste;
	@Column(name = "nom_poste", columnDefinition = "varchar(30)")
	private String nom_poste;
	@Column(name = "date", columnDefinition = "varchar(30)")
	private String date;
	
	@ManyToOne (targetEntity=user.User.class)
	@JoinColumn (name ="id_user")
	private user.User user;
	
	@OneToMany (targetEntity=commentaire.Commentaire.class)
	@JoinColumn (name="id_poste")
	private Set<commentaire.Commentaire> commentaires; 
	
	@Column(name = "resolue", columnDefinition = "boolean")
	private boolean resolue;
	@Column(name = "sujet_id", columnDefinition = "int(255)")
	private Integer sujet_id;
	
	
	public Poste(String nom_poste, String date, boolean resolue) {
		this.nom_poste = nom_poste;
		this.date = date;
		this.resolue = resolue;
		
		
	}
	
	public Poste(String nom_poste) {
	this.nom_poste = nom_poste;	
	}

	public Integer getId_poste() {
		return id_poste;
	}


	public void setId_poste(Integer id_poste) {
		this.id_poste = id_poste;
	}


	public String getNom_poste() {
		return nom_poste;
	}


	public void setNom_poste(String nom_poste) {
		this.nom_poste = nom_poste;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public user.User getUser() {
		return user;
	}


	public void setUser(user.User user) {
		this.user = user;
	}


	public Boolean getResolue() {
		return resolue;
	}


	public void setResolue(Boolean resolue) {
		this.resolue = resolue;
	}


	public Integer getSujet_id() {
		return sujet_id;
	}


	public void setSujet_id(Integer sujet_id) {
		this.sujet_id = sujet_id;
	}

	@Override
	public String toString() {
		return "Poste [id_poste=" + id_poste + ", nom_poste=" + nom_poste + ", date" + date + ", resolue=" + resolue
				+ ", sujet_id=" + sujet_id + "]";
	}
}
