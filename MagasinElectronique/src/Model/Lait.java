package Model;

import java.time.LocalDate;
import java.util.Iterator;

public class Lait extends Alimentaire {
	private boolean matierGrasse ;

	public Lait(String nom, String marque, float prix, Unite unite, int tVA, LocalDate dateExpiration,
			boolean matierGrasse) {
		super(nom, marque, prix, unite, tVA, dateExpiration);
		this.matierGrasse = matierGrasse;
	}

	public boolean isMatierGrasse() {
		return matierGrasse;
	}

	public void setMatierGrasse(boolean matierGrasse) {
		this.matierGrasse = matierGrasse;
	}

	@Override
	public String toString() {
		return super.toString() +"Lait [matierGrasse=" + matierGrasse + "]";
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrixTTC() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
