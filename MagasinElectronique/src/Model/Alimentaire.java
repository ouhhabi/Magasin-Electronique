package Model;

import java.time.LocalDate;

abstract class Alimentaire extends Article {
	
	protected LocalDate dateExpiration ;

	public Alimentaire(String nom, String marque, float prix, Unite unite, int tVA, LocalDate dateExpiration) {
		super(nom, marque, prix, unite, tVA);
		this.dateExpiration = dateExpiration;
		
	}

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@Override
	public String toString() {
		return super.toString() + "Alimentaire [dateExpiration=" + dateExpiration + "]";
	}
	
	
	
	

}
