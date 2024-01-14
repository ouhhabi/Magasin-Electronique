package Model;

import java.util.ArrayList;
import java.util.List;



public class Magasin {

	private String nom ;
	private String adresse ;
	 private List<Article> depotArticles;

	    public Magasin(String nom, String adresse) {
	        this.nom = nom;
	        this.adresse = adresse;
	        this.depotArticles = new ArrayList<Article>();
	    }
	    

	    public Magasin(String nom, String adresse , Article ... A) {
	    	super();
			this.nom = nom;
			 this.adresse = adresse;
			 this.depotArticles = new ArrayList<Article>();
			for(Article x : A)
				this.depotArticles.add(x);
	        
	        
	    }
	    public void ajouterArticle(Article article) {
	    	depotArticles.add(article);
	        System.out.println("Article ajouté : " + article.getNom());
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getAdresse() {
	        return adresse;
	    }

	    public List<Article> getDepotArticles() {
	        return depotArticles;
	    }


	    public void supprimerArticle(String nomArticleASupprimer) {
	        depotArticles.remove(nomArticleASupprimer);
	    }
}
