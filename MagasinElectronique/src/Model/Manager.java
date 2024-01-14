package Model;

import java.awt.Color;
import java.util.Scanner;
import java.time.LocalDate;

public class Manager {
	private String nom;
    private int age;
    private Magasin magasin;  // Référence au magasin géré par le manager

    public Manager(String nom, int age, Magasin magasin) {
        this.nom = nom;
        this.age = age;
        this.magasin = magasin;
    }

    public  void afficherMenu() {
        System.out.println("Menu du Manager " + nom + " (" + age + " ans) - " + magasin.getNom());
        System.out.println("1 – Ajouter un nouvel article");
        System.out.println("2 – Afficher la liste des articles par catégorie");
        System.out.println("3 – Afficher tous les articles présents dans le dépôt");
        System.out.println("4 – Supprimer un article");
        System.out.println("5 – Quitter le programme");
    }

   public void gererMagasin() {
        Scanner scanner = new Scanner(System.in);
        Categorie cat ;
        int choix;
        int choix2;
        do {
            // Affiche le menu
            afficherMenu();

            // Demande à l'utilisateur de faire un choix
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();

            // Effectuez les opérations en fonction du choix
            switch (choix) {
                case 1:
                    // Ajouter un nouvel article
                    System.out.println("Option 1 : Ajouter un nouvel article");
                    // Demander les détails de l'article à l'utilisateur et ajouter à la liste
                    System.out.print("Nom de l'article : ");
                    String nomArticle = scanner.next();
                    System.out.print("Catégorie de l'article :  VESTIMENTAIRE   ;ALIMENTAIRE    ;  ELECTROMENAGER");
                   String categorieArticle = scanner.next();
                  
                   CategorieArticle CatArticle= CategorieArticle.valueOf(categorieArticle.toUpperCase());
                   
                    switch (categorieArticle) {
                    
                    
                    case "VESTIMENTAIRE" :
                    	
                    	if(nomArticle=="Chemise") {
                    		
                    	String nomChemise = nomArticle;
                    System.out.print("La marque de l'article : ");
                    String MarqueChemise = scanner.next();
                    
                    System.out.print("Le prix de l'article : ");
                    float PrixChemise = scanner.nextFloat();
                    
                    System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                    String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                    Unite uniteCh= null;
                    try {
                        uniteCh = Unite.valueOf(input);
                        System.out.println("Vous avez choisi : " + uniteCh);
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                    }
                    System.out.print("le taux de TVA :");
                    int TvaChemise = scanner.nextInt();
                    
                    
                    
                    System.out.print(" la taille : ");
                    int tailleChemise = scanner.nextInt();
                    System.out.print(" la couleur :");
                   String couleurChemise = scanner.next();
                   Color colorChemise = Color.getColor(couleurChemise);
                    System.out.print(" la categorie :");
                    String categorieChemise = scanner.next();
                    Categorie CatChemise = Categorie.valueOf(categorieChemise.toUpperCase());
                    
                    System.out.print(" la chemise à des manches ?  ");
                    boolean Manche = scanner.nextBoolean();
                    
                    Chemise CH = new Chemise(nomChemise, MarqueChemise, PrixChemise, uniteCh, TvaChemise, tailleChemise, colorChemise.CYAN, CatChemise, Manche);
                    
                    magasin.ajouterArticle(CH);
                    	}else {
                    
                    	
                    	String nomPantalon =nomArticle ;
                    	System.out.print("La marque de l'article : ");
                        String MarquePantalon = scanner.next();
                        
                        System.out.print("Le prix de l'article : ");
                        float PrixPantalon = scanner.nextFloat();
                        
                        System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                        String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                        Unite unitePan= null;
                        try {
                            unitePan = Unite.valueOf(input);
                            System.out.println("Vous avez choisi : " + unitePan);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                        }
                        
                        System.out.print("le taux de TVA ");
                       int TvaPantalon = scanner.nextInt();
                        System.out.print(" la taille  ");
                        int taillePantalon = scanner.nextInt();
                        System.out.print(" la longueur du pantalon : ");
                        float longueurPantalon = scanner.nextFloat();
                        System.out.print(" la couleur :");
                        String couleurPantalon = scanner.next();
                        Color colorPantalon = Color.getColor(couleurPantalon);
                         System.out.print(" la categorie :");
                         String categoriePantalon = scanner.next();
                         Categorie CatPantalon = Categorie.valueOf(categoriePantalon.toUpperCase());
                        
                        Pantalon Pan = new Pantalon(nomPantalon, MarquePantalon, PrixPantalon, unitePan, TvaPantalon, taillePantalon, colorPantalon.CYAN, CatPantalon , longueurPantalon);
                        
                        magasin.ajouterArticle(Pan);
                    	}
                    	break;
                    case "ELECTROMENAGER": 
                    	
                    	if(nomArticle=="Television") {
                    	String nomTelevision =nomArticle ;
                    	
                    	
                        System.out.print("La marque de l'article : ");
                        String MarqueTelevision = scanner.next();
                        
                        System.out.print("Le prix de l'article : ");
                        float PrixTelevision= scanner.nextFloat();
                        System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                        String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                        Unite uniteTel= null;
                        try {
                            uniteTel = Unite.valueOf(input);
                            System.out.println("Vous avez choisi : " + uniteTel);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                        }
                        System.out.print("le taux de TVA :");
                        int TvaTelevision = scanner.nextInt();
                    	
                    	
                    	 System.out.print(" la puissance :  ");
                         int PuissanceTel = scanner.nextInt();
                         System.out.print(" la garantie :  ");
                         int GarantieTel = scanner.nextInt();
                         System.out.print(" la taille :  ");
                         float Taille = scanner.nextFloat();
                         Television T = new Television(nomTelevision, MarqueTelevision,PrixTelevision,uniteTel,TvaTelevision,PuissanceTel,GarantieTel,Taille);
                         
                         magasin.ajouterArticle(T);
                    	}else {
                    		
                    	
                    	String nomRefrigerateur =nomArticle ;
                    	
                    	System.out.print("La marque de l'article : ");
                        String MarqueRefrigerateur = scanner.next();
                        
                        System.out.print("Le prix de l'article : ");
                        float PrixRefrigerateur= scanner.nextFloat();
                        
                        System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                        String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                        Unite uniteRef= null;
                        try {
                            uniteRef = Unite.valueOf(input);
                            System.out.println("Vous avez choisi : " + uniteRef);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                        }
                        System.out.print("le taux de TVA :");
                        int TvaRefrigerateur = scanner.nextInt();
                    	
                    	
                    	System.out.print(" la puissance :  ");
                        int PuissanceRef = scanner.nextInt();
                        System.out.print(" la garantie :  ");
                        int GarantieRef = scanner.nextInt();
                        System.out.print(" le volume ");
                        float Volume = scanner.nextFloat();
                        Refrigerateur R = new Refrigerateur(nomRefrigerateur, MarqueRefrigerateur,PrixRefrigerateur,uniteRef,TvaRefrigerateur,PuissanceRef,GarantieRef,Volume);
                        
                        magasin.ajouterArticle(R);
                    		}
                    	break;
                        
                    case "ALIMENTAIRE":
                    	 
                    	if(nomArticle=="Lait") {
                          	String nomLait =nomArticle ;
                          System.out.print("La marque de l'article : ");
                          String MarqueLait = scanner.next();
                          
                          System.out.print("Le prix de l'article : ");
                          float PrixLait = scanner.nextFloat();
                          
                          System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                          String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                          Unite uniteLait = null;
                          try {
                               uniteLait = Unite.valueOf(input);
                              System.out.println("Vous avez choisi : " + uniteLait);
                          } catch (IllegalArgumentException e) {
                              System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                          }
                          System.out.print("le taux de TVA :");
                          int TvaLait = scanner.nextInt();
                          
                          System.out.print("la date d'expiration (YYYY-MM-dd) :");
                          String DateExLait = scanner.next();

                          // Convertir la chaîne en LocalDate
                          LocalDate dateLait = LocalDate.parse(DateExLait);
                          System.out.print(" le lait écréme ?  ");
                          boolean MatiereGrasse = scanner.nextBoolean();
                          Lait Lai = new Lait(nomLait, MarqueLait,PrixLait,uniteLait,TvaLait,dateLait,MatiereGrasse);
                          
                          magasin.ajouterArticle(Lai);
                          
                    	}else {
                   
                    	String nomPain =nomArticle ;
                        System.out.print("La marque de l'article : ");
                        String MarquePain = scanner.next();
                        
                        System.out.print("Le prix de l'article : ");
                        float PrixPain = scanner.nextFloat();
                        
                        System.out.print("Entrez une unité (PIECE, METRE, KILOGRAMME,LITRE) : ");
                        String input = scanner.nextLine().toUpperCase();  // Convertir la saisie en majuscules pour correspondre aux constantes de l'énumération
                        Unite unitePain= null;
                        try {
                             unitePain = Unite.valueOf(input);
                            System.out.println("Vous avez choisi : " + unitePain);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Unité non valide. Veuillez entrer une unité correcte.");
                        }
                        System.out.print("le taux de TVA :");
                        int TvaPain = scanner.nextInt();
                        System.out.print("la date d'expiration (YYYY-MM-dd) :");
                        String DateExPain = scanner.next();

                        LocalDate datePain = LocalDate.parse(DateExPain);
                        
                        System.out.print(" le pain avec sel ?  ");
                        boolean sel = scanner.nextBoolean();
                        
                        Pain Pai = new Pain(nomPain, MarquePain,PrixPain,unitePain,TvaPain,datePain,sel);
                        magasin.ajouterArticle(Pai);
                        
                    	}
                    default:
                        System.out.println("Choix invalide. Veuillez choisir une option valide.");
                } 
                 break;
                    
                case 2:
                    // Afficher la liste des articles par catégorie
                    System.out.println("Option 2 : Afficher la liste des articles par catégorie");
                    // Appeler la méthode correspondante dans la classe Magasin
                   // magasin.afficherArticlesParCategorie();
                    break;
                case 3:
                    // Afficher tous les articles présents dans le dépôt
                    System.out.println("Option 3 : Afficher tous les articles présents dans le dépôt");
                    // Appeler la méthode correspondante dans la classe Magasin
                    //  magasin.afficherTousLesArticles();
                    break;
                case 4:
                    // Supprimer un article
                    System.out.println("Option 4 : Supprimer un article");
                    // Demander le nom de l'article à supprimer et supprimer de la liste
                  
                    System.out.print("Nom de l'article à supprimer : ");
                       String nomArticleASupprimer = scanner.next();
                       
                 // Recherche de l'article dans la liste et suppression
                     magasin.supprimerArticle(nomArticleASupprimer);
                    break;
                case 5:
                    // Quitter le programme
                    System.out.println("Option 5 : Quitter le programme");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }

        } while (choix != 5);

        scanner.close();
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
	@Override
	public String toString() {
		return "Manager [nom=" + nom + ", age=" + age + "]";
	}
	


}
