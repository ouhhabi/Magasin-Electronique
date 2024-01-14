package Model;

abstract class Electromenager extends Article {
	
	protected int puissance ;
	protected int garantie ;
	
	

	public Electromenager(String nom, String marque, float prix, Unite unite, int tVA, int puissance, int garantie) {
		super(nom, marque, prix, unite, tVA);
		this.puissance = puissance;
		this.garantie = garantie;
	}



	public int getPuissance() {
		return puissance;
	}



	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}



	public int getGarantie() {
		return garantie;
	}



	public void setGarantie(int garantie) {
		this.garantie = garantie;
	}



	@Override
	public String toString() {
		return super.toString()+ "Electromenager [puissance=" + puissance + ", garantie=" + garantie + "]";
	}
	
	public double getPrixTTC() {
        double prixTTC = getPrix(); // Prix initial sans taxes

        // Taxe TVA de 15%
        prixTTC *= 1.15;

        if (prixTTC > 5000) {
            // Taxe de taxeCarbone de 7% si le prix dépasse 5000 dh
            prixTTC *= 1.07;
        }

        return prixTTC;
    }
	
	
	
	
	

}
