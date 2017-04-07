package service;

import metier.Personne;

public class PersonneService {

	public void marcher(Personne p){
		
		System.out.println(p.getNom() + " MARCHE");
	}

	public String arreter(Personne p){
		
		return p.getNom() + " S'ARRETE";
		
	}
	
}
