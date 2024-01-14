package Controller;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Article;
import Model.Categorie;
import Model.Chemise;
import Model.Client;
import Model.Facture;
import Model.Lait;
import Model.Magasin;
import Model.Manager;
import Model.Pain;
import Model.Panier;
import Model.Pantalon;
import Model.Refrigerateur;
import Model.Television;
import Model.Unite;

public class MainClass {
	
	

	

	public static <Vestimentaire, Alimentaire> void main(String[] args) {
		// TODO Auto-generated method stub
		// teste des class pantalon et chemise 
		Pantalon Pan = new Pantalon("Jean", "Zara",200, Unite.PIECE,20, 36, Color.black,Categorie.FEMME,60);
		Chemise CH = new Chemise("Chemise ", "zara", 300, Unite.PIECE, 20, 20, Color.CYAN, Categorie.FEMME , false);
		/*System.out.println(Pan);
		System.out.println(CH);*/
		// teste des classe Television et Refrigerateur
		Television T = new Television("Television", "Sony",2000,Unite.PIECE,10,300,2,98);
		Refrigerateur R = new Refrigerateur("Refrigerateur", "samsung",2000,Unite.PIECE,10,300,2,98);
		/*System.out.println(T);
		System.out.println(R);*/
		Pain Pai = new Pain("Pain","francaise",30,Unite.PIECE, 20, LocalDate.of(2022, 1, 1),false);
		Lait Lai = new Lait("Lait","central",30,Unite.PIECE, 20, LocalDate.of(2022, 1, 1),false);
		/*	System.out.println(Pai);
		System.out.println(Lai);*/
		Magasin magasin = new Magasin("Mon Magasin", "Rue du Commerce");

        // Ajout d'articles au magasin
       
        magasin.ajouterArticle(Pai);
        magasin.ajouterArticle(Lai);
        magasin.ajouterArticle(R);
        
	//-------------------- Pour tester class Manager -----------------------------
		Manager manager = new Manager("Hamza",29,magasin);
		/*manager.afficherMenu();
		manager.gererMagasin();*/
		//-------------------- Pour tester class Client -----------------------------
		
		Panier P =new Panier();
		P.add(CH);
		P.add(R);
		P.add(Lai);
		Client client1 = new Client("omayma", 30, P);
       
        List<Article> articlesDisponibles = new ArrayList<>();
        articlesDisponibles.add(Pan);
        articlesDisponibles.add(Lai);
        

      //  client1.afficherMenu(articlesDisponibles);
		
      //-------------------- Pour tester class facture -----------------------------
        Facture F1 = new Facture (client1);
  	  
  	 
  	 // F1.calculerMontantTotal();
  	 // client1.afficherMenu(articlesDisponibles);
  	  F1.editerFacture();
  	  
  	  
		
	}

}
