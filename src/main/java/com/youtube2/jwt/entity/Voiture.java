package com.youtube2.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
    private int matricule;
	private int prix;
    private int puissance;
    private String categorie;
	private String model;
	private String marque;
    private String etat;
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
    
}
