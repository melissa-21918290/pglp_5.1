package pglp_5.exo5_1;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
public class GroupePersonnel implements Hierarchie, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Hierarchie> personne = new ArrayList<Hierarchie>();
	
	//creer un groupe personnels
	private String nomDuGroupe;
	public GroupePersonnel(final String nom){
		this.nomDuGroupe = nom;
	}
	
	
	//recuperer le nom du groupe
	
	 public String getName(){
		 return this.nomDuGroupe;
	 }
	 //afficher les composants
	  
	public void print() {
		System.out.println(this.getName());
	
		for(Hierarchie composant: personne) {
			composant.print();
		}
	}
	
	//retourne la liste des composants
	public List<Hierarchie> getList(){
		return (List<Hierarchie>) Collections.unmodifiableCollection(personne) ;
		
		
	}
	//ajout de composant au groupe
	public void add(Hierarchie composant) {
		personne.add(composant);
	}
	
	//retirer un composanr du groupe
	public void remove(Hierarchie composant) {
		personne.remove(composant);
	}

}