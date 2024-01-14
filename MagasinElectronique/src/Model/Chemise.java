package Model;

import java.awt.Color;
import java.util.Iterator;

import javax.swing.plaf.synth.ColorType;

public class Chemise extends Vestimentaire {
	
	private boolean manche ;

	public Chemise(String nom, String marque, float prix, Unite unite, int tVA, int taille, Color color,
			Categorie categorie, boolean manche) {
		super(nom, marque, prix, unite, tVA, taille, color, categorie);
		this.manche = manche;
	}

	public boolean isManche() {
		return manche;
	}

	public void setManche(boolean manche) {
		this.manche = manche;
	}

	@Override
	public String toString() {
		
		return super.toString() + "Chemise [manche=" + manche + "]";
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
