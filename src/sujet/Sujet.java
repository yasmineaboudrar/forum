package sujet;

import java.util.Set;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Sujet")

public class Sujet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "int(255)")
	private Integer sujet_id;
	@Column(name = "nom_sujet", columnDefinition = "varchar(30)")
	private String nom_sujet;
	
	@OneToMany (targetEntity=poste.Poste.class)
	@JoinColumn (name="sujet_id")
	private Set<poste.Poste> postes; 
	
	public Sujet(String nom_sujet) {
		this.nom_sujet = nom_sujet;
	}
	
	public Sujet() {
		
	}

	public Integer getSujet_id() {
		return sujet_id;
	}

	public void setSujet_id(Integer sujet_id) {
		this.sujet_id = sujet_id;
	}

	public String getNom_sujet() {
		return nom_sujet;
	}

	public void setNom_sujet(String nom_sujet) {
		this.nom_sujet = nom_sujet;
	}
	
	@Override
	public String toString() {
		return "Sujet [sujet_id=" + sujet_id + ", nom_sujet=" + nom_sujet + "]";
	}

	
}
