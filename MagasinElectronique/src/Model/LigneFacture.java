package Model;

public class LigneFacture {
	
	
	        public Article article ;
	       public int quantite=1;

	        public LigneFacture(Article article, int quantite) {
	            this.article = article;
	            this.quantite = quantite;
	            
	        }
	        
	        public double calculerMontantLigne() {
	            
	            
	            double total = 0;
	            
	                total += article.getPrix();
	            
	            return total;
	        }

	        
	        
	        
	        
	        
	      
}
