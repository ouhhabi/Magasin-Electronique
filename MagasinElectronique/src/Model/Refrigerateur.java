package Model;

import java.util.Iterator;

public class Refrigerateur extends Electromenager {
	private float volume ;

	public Refrigerateur(String nom, String marque, float prix, Unite unite, int tVA, int puissance, int garantie,
			float volume) {
		super(nom, marque, prix, unite, tVA, puissance, garantie);
		this.volume = volume;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return super.toString() +"Refrigerateur [volume=" + volume + "]";
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
