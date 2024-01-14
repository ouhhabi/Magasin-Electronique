package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Client {
 private String nom ;
 private int age ;
 private Panier panier ;
public Client(String nom, int age, Panier panier) {
	super();
	this.nom = nom;
	this.age = age;
	this.panier = panier ;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Panier getPanier() {
	return panier;
}
public void setPanier(Panier panier) {
	this.panier = panier;
}
@Override
public String toString() {
	return "Client [nom=" + nom + ", age=" + age + ", panier=" + panier + "]";
}

public void afficherMenu(List<Article> articlesDisponibles) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Menu du Client");
        System.out.println("1 – Afficher les articles disponibles par catégorie");
        System.out.println("2 – Ajouter un article au panier");
        System.out.println("3 – Supprimer un article du panier");
        System.out.println("4 – Vider le panier");
        System.out.println("5 – Calculer le montant total");
        System.out.println("6 – Quitter le programme");

        System.out.print("Choisissez une option : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                afficherArticlesParCatégorie(articlesDisponibles);
                break;
            case 2:
                ajouterArticleAuPanier(articlesDisponibles);
                break;
            case 3:
                supprimerArticleDuPanier();
                break;
            case 4:
                viderPanier();
                break;
            case 5:
                calculerMontantTotal();
                break;
            case 6:
                System.out.println("Merci d'avoir utilisé notre application. Au revoir !");
               
                
                System.exit(0);
            default:
                System.out.println("Option invalide. Veuillez choisir une option valide.");
        }
    }
}
public void genererFacture() {
    Facture facture = new Facture(this);
    System.out.println("Facture générée pour le client :");
    
    
    // Appeler la méthode pour éditer la facture et créer le fichier
    facture.editerFacture();
}
public void afficherArticlesParCatégorie(List<Article> articlesDisponibles) {
    System.out.println("Articles disponibles par catégorie :");
    // Ajoutez le code pour afficher les articles par catégorie
    for (Article article : articlesDisponibles) {
        System.out.println(article);
    }
}

public void ajouterArticleAuPanier(List<Article> articlesDisponibles) {
    System.out.println("Liste des articles disponibles :");
    // Afficher les articles disponibles
    afficherArticlesParCatégorie(articlesDisponibles);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le numéro de l'article que vous souhaitez ajouter au panier : ");
    int choixArticle = scanner.nextInt();

    if (choixArticle >= 1 && choixArticle <= articlesDisponibles.size()) {
        Article articleChoisi = articlesDisponibles.get(choixArticle - 1);
        panier.add(articleChoisi);
        System.out.println("Article ajouté au panier : " + articleChoisi);
    } else {
        System.out.println("Numéro d'article invalide. Veuillez choisir un numéro valide.");
    }
}

public void supprimerArticleDuPanier() {
    System.out.println("Votre panier actuel :");
    afficherPanier();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le numéro de l'article que vous souhaitez supprimer du panier : ");
    int choixArticle = scanner.nextInt();

    if (choixArticle >= 1 && choixArticle <= panier.size()) {
        Article articleSupprime = panier.remove(choixArticle - 1);
        System.out.println("Article supprimé du panier : " + articleSupprime);
    } else {
        System.out.println("Numéro d'article invalide. Veuillez choisir un numéro valide.");
    }
}

public void viderPanier() {
    panier.clear();
    System.out.println("Le panier a été vidé.");
}

public double calculerMontantTotal() {
    double montantTotal = 0;
    for (int i = 0; i < panier.size(); i++) {
        Article article = panier.get(i);
        montantTotal += article.getPrix();
    }
    System.out.println("Montant total du panier : " + montantTotal);
    return montantTotal;
}

public void afficherPanier() {
    System.out.println("Votre panier actuel :");
    for (int i = 0; i < panier.size(); i++) {
        System.out.println((i + 1) + " - " + panier.get(i));
    
}


}}
 

