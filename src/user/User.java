package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "int(255)")
	private Integer id_user;
	@Column(name = "nom_user", columnDefinition = "varchar(30)")
	private String nom_user;
	@Column(name = "email", columnDefinition = "varchar(30)")
	private String email;
	@Column(name = "password", columnDefinition = "varchar(30)")
	private String password;
	@Column(name = "role", columnDefinition = "varchar(30)")
	private String role;
	public User(String nom_user, String mail_user, String password) {
		this.nom_user = nom_user;
		this.email = mail_user;
		this.password = password;
	}

	public User() {
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	public String getMail_user() {
		return email;
	}

	public void setMail_user(String mail_user) {
		this.email = mail_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", nom_user=" + nom_user + ", email=" + email + ", password=" + password
				+ ", role=" + role + "]";
	}

}