package presentation;

import java.util.Scanner;

import metier.Personne;
/**
 * Démarrae de l'application
 * @author Stagiaire
 * @version 1.0
 */
public class Lanceur {

	/**
	 * La méthode main est chargée en mémoire au démarrage de l'application
	 * Elle peut donc être utilisée avant la creation de tout objet 
	 * @param args arguments de la méthode
	 */
	public static void main(String[] args) {
		// Création d'un objet personne
		Personne p = new Personne();
		// Valorisation des attributs
		// Personne : type d'objet , p : valeur , personne() constructeur
		p.setNom("Espuche");
		p.setPrenom("Marine");
		p.setAge(25);
		// Affichage des attributs
		System.out.println("nom = " + p.getNom());
		System.out.println("prenom = " + p.getPrenom());
		System.out.println("age = " + p.getAge() +" ans");
		
		
		System.out.println("------------------------------------------");
		Personne p2= new Personne("Test", "Dupond", 40);
		System.out.println("nom = " + p2.getNom());
		System.out.println("prenom = " + p2.getPrenom());
		System.out.println("age = " + p2.getAge() +" ans");
		
		
		Personne p3= new Personne("A", "B");
		p3.setAge(20);
		System.out.println("------------------------------------------");
		System.out.println("nom = " + p3.getNom());
		System.out.println("prenom = " + p3.getPrenom());
		System.out.println("age = " + p3.getAge() +" ans");
		
		
		System.out.println("------------------------------------------");
		
		
		// test classe scanner, ouverture d'un canal clavier : il faut le fermer après
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir le nom");
		String leNom = clavier.next();
		System.out.println("Saisir le prénom");
		String lePrenom = clavier.next();
		System.out.println("Saisir l'age");
		int lAge = clavier.nextInt();
		Personne p4= new Personne(leNom, lePrenom, lAge); //Creation d'objet p4

		System.out.println(p4);
		clavier.close();
		
	}

}
