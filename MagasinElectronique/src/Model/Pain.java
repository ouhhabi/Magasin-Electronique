package Model;

import java.time.LocalDate;
import java.util.Iterator;

public class Pain extends Alimentaire  {
      
	private Boolean sel ;

	public Pain(String nom, String marque, float prix, Unite unite, int tVA, LocalDate dateExpiration, Boolean sel) {
		super(nom, marque, prix, unite, tVA, dateExpiration);
		this.sel = sel;
	}

	public Boolean getSel() {
		return sel;
	}

	public void setSel(Boolean sel) {
		this.sel = sel;
	}

	@Override
	public String toString() {
		return super.toString() +"Pain [sel=" + sel + "]";
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
