/**
 * 
 */
/**
 * @author Stagiaire
 *
 */
package metier;
// doc technique
/**
 * Classe Personne qui sert à définir une personne
 * @author Stagiaire
 * @version 1.0
 */
public class Personne {
	
	private String nom;
	private String prenom;
	private int age;
	
	
	/**
	 * Méthode d'affichage de la personne
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}//sysout (p) methode qui permet d'aficher l'objet qui est défini dans la classe

/**
 * Première méthode constructeur personne
 * @param nom nom de la personne
 * @param prenom prenom de la personne
 * @param age age dela personne
 */
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;// this = p si personne p = new personne (....)
		this.prenom = prenom;
		this.age = age;
	}
	
	/**
	 * Deuxième méhode constructeur méthode
	 * @param nom nom de la personne
	 * @param prenom prenom de la personne
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Troisime méthode constructeur personne
	 */
	public Personne() {
		super();
	}

/**
 * getter de l'attribut nom
 * @return nom de la personne
 */
	public String getNom() {
		// Methode spécifique : signature (visibilité, type de retour(String), nom de la méthode(getter), valeur du retour (return)
		return nom;
	}
	
	/**
	 * Setter attribut Nom
	 * @param nom nom de la personne
	 */
	public void setNom(String nom) {
		// Methode spécifique : signature (visibilité, type de retour(void), nom de la méthode(setter), valeur du retour = type d'argument (modification)
		this.nom = nom;
	}
	
	/**
	 * Getter attribut prenom
	 * @return prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Setter attribut prenom
	 * @param prenom prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Getter attribut age
	 * @return age de la personne
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Setter attribut age
	 * 
	 * @param age age de la personne
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
