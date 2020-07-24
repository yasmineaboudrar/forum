package commentaire;




import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "Commentaire")

public class Commentaire {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "int(255)")
	private Integer id_comment;
	@Column(name = "comment", columnDefinition = "varchar(300)")
	private String comment;
	
	
	
	
	public Commentaire(String comment) {
		this.comment=comment;
	}
	
	public Commentaire() {
		
	}

	public Integer getId_comment() {
		return id_comment;
	}

	public void setId_comment(Integer id_comment) {
		this.id_comment = id_comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Commentaire [id_comment=" + id_comment + ", comment=" + comment + "]";
	}
}
