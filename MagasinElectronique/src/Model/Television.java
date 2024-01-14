package Model;

import java.util.Iterator;

public class Television extends Electromenager  {
	
	private float taille ;

	public Television(String nom, String marque, float prix, Unite unite, int tVA, int puissance, int garantie,
			float taille) {
		super(nom, marque, prix, unite, tVA, puissance, garantie);
		this.taille = taille;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return super.toString() +"Television [taille=" + taille + "]";
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getPrixTTC() {
        double prixTTC = getPrix(); // Prix initial sans taxes

       // taxeAudioVisuelle de 3%
        prixTTC *= 1.03;
        return prixTTC;
    }
	
	

}
