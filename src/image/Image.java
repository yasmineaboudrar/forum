package image;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Image")

public class Image {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", columnDefinition = "int(255)")
	private Integer id_image;
	@Column(name = "path", columnDefinition = "varchar(300)")
	private String path;
	
	@OneToOne
	@JoinColumn (name= "id_poste")
	private poste.Poste poste;
	
	public Image(String path) {
		this.path=path;
		
	}
	public Image() {
		
	}
	public Integer getId_image() {
		return id_image;
	}
	public void setId_image(Integer id_image) {
		this.id_image = id_image;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public poste.Poste getPoste() {
		return poste;
	}
	public void setPoste(poste.Poste poste) {
		this.poste = poste;
	}
	
	@Override
	public String toString() {
		return "Image [id_image=" + id_image + ", path=" + path + "]";
	}
}
