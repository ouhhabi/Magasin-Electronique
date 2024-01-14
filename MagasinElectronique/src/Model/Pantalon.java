package Model;

import java.awt.Color;
import java.util.Iterator;

import javax.swing.plaf.synth.ColorType;

public class Pantalon extends Vestimentaire {
	
	private float longueur;

	public Pantalon(String nom, String marque, float prix, Unite unite, int tVA, int taille, Color color,
			Categorie categorie, float longueur) {
		super(nom, marque, prix, unite, tVA, taille, color, categorie);
		this.longueur = longueur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return super.toString() + "Pantalon [longueur=" + longueur + "]";
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
