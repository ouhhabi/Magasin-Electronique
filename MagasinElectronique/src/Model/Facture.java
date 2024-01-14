package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facture {
	
	private static int dernierNumeroSerie = 0;  // Pour stocker le dernier numéro de série utilisé
    private int numeroSerie;
    private Client client;
    private Date dateCreation;
    private List<LigneFacture> lignesFacture;
	
	 public Facture(Client client) {
		 
	        this.numeroSerie = ++dernierNumeroSerie;
	        this.client = client;
	        this.dateCreation = new Date();
	        this.lignesFacture = new ArrayList<>();
	    }
	 
	 /*   public void ajouterLigneProduit(Article article, int quantite) {
	        LigneFacture nouvelleLigne = new LigneFacture(article, quantite);
	        lignesFacture.add(nouvelleLigne);
	    }
	    */
	    
	       
	     
	    
	    
	    
	    public void editerFacture() {
	        String nomFichier = "facture_" + numeroSerie + "_" + client.getNom() + ".txt";

	        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
	            // En-tête du bilan de vente
	            writer.println("BILAN DE VENTE");
	            writer.println("---------------");
	            writer.println("Nom du client: " + client.getNom());
	            writer.println("Numéro de série de la facture: " + numeroSerie);
	            writer.println("Date de création: " + dateCreation);
	            writer.println();

	            // Détails des articles avec les TVA appliquées
	            writer.println("Détails de la facture:");
	            for (LigneFacture ligne : lignesFacture) {
	                writer.println("- Produit: " + ligne.article.getNom());
	                writer.println("  Prix unitaire: " + ligne.article.getPrix());
	                writer.println("  Quantité: " + ligne.quantite);
	                writer.println("  Montant de la ligne: " + ligne.calculerMontantLigne());
	                writer.println();
	            }

	            // Montant total de la facture
	           
	            writer.println(" Montant total de la facture: " + client.calculerMontantTotal());
                writer.println();
	            
	           

	            System.out.println("La facture a été éditée avec succès. Consultez le fichier " + nomFichier);
	        } catch (IOException e) {
	            System.err.println("Erreur lors de la création du fichier facture.");
	            e.printStackTrace();
	        } 
	    
	    }
	    }