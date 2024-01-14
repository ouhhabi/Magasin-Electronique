package Model;

import java.util.Iterator;

public abstract class Article implements Iterable {
	protected String nom ;
	protected String marque ;
	protected float prix ;
	protected Unite unite ;
	protected int TVA ;
	public abstract double getPrixTTC();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Unite getUnite() {
		return unite;
	}
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
	public int getTVA() {
		return TVA;
	}
	public void setTVA(int tVA) {
		TVA = tVA;
	}
	@Override
	public String toString() {
		return "Article [nom=" + nom + ", marque=" + marque + ", prix=" + prix + ", unite=" + unite + ", TVA=" + TVA
				+ "]";
	}
	public Article(String nom, String marque, float prix, Unite unite, int tVA) {
		super();
		this.nom = nom;
		this.marque = marque;
		this.prix = prix;
		this.unite = unite;
		TVA = tVA;
	}
	
	
	
	
	

}
