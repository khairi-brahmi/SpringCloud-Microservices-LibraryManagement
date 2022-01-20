package fst.if5.cloud.projetMicroServices.student.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "student")
public class Student {

	@Id
	private String id;
	private String name;
	private String adresse;
	private String niveau;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateNaissance;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adresse=" + adresse + ", niveau=" + niveau
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	
	public Student(String id, String name, String adresse, String niveau, Date dateNaissance) {
		super();
		this.id = id;
		this.name = name;
		this.adresse = adresse;
		this.niveau = niveau;
		this.dateNaissance = dateNaissance;
	}

	public Student() {
		super();
	}
	
}