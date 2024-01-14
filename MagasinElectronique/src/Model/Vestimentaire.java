package Model;



import java.awt.Color;

import javax.swing.plaf.synth.ColorType;

abstract class Vestimentaire extends Article {
	protected int taille ;
	protected Color color ;
	protected Categorie categorie ;
	

	public Vestimentaire(String nom, String marque, float prix, Unite unite, int tVA , int taille , Color color, Categorie categorie) {
		super(nom, marque, prix, unite, tVA);
		this.categorie = categorie ;
		this.color = color ;
		this.taille = taille ;
		
		// TODO Auto-generated constructor stub
	
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	@Override
	public String toString() {
		return super.toString() + "Vestimentaire [taille=" + taille + ", color=" + color + ", categorie=" + categorie + "]";
	}
	
	public double getPrixTTC() {
        double prixTTC = getPrix(); // Prix initial sans taxes

        // Taxe TVA de 10%
        prixTTC *= 1.10;

        if (prixTTC > 500) {
            // Taxe de solidarité de 5% si le prix dépasse 500 dh
            prixTTC *= 1.05;
        }

        return prixTTC;
    }

}
