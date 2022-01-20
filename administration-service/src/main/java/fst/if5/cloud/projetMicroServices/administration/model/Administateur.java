package fst.if5.cloud.projetMicroServices.administration.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Administateur")
public class Administateur {

	@Id
	private String id;
	private String name;
	private String numTel;
	private String adresse;
	private Long cin;
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
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getCin() {
		return cin;
	}
	public void setCin(Long cin) {
		this.cin = cin;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Administateur(String id, String name, String numTel, String adresse, Long cin, Date dateNaissance) {
		super();
		this.id = id;
		this.name = name;
		this.numTel = numTel;
		this.adresse = adresse;
		this.cin = cin;
		this.dateNaissance = dateNaissance;
	}

	public Administateur() {
		super();
	}
	
	@Override
	public String toString() {
		return "Administateur [id=" + id + ", name=" + name + ", numTel=" + numTel + ", adresse=" + adresse + ", cin="
				+ cin + ", dateNaissance=" + dateNaissance + "]";
	}
	
}
