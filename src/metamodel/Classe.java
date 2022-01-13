package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class Classe implements Visitable {

	private String nom;
	private List<Propriete> proprietes;
	private List<Methode> methodes;

	public Classe() {
		this.proprietes = new ArrayList<Propriete>();
		this.methodes = new ArrayList<Methode>();
	}
	
	public Classe(String nom) {
		this.nom = nom;
		this.proprietes = new ArrayList<Propriete>();
		this.methodes = new ArrayList<Methode>();
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void accept(Visiteur visiteur) {
		visiteur.visitClasse(this);		
	}
	
	public void add(Propriete propriete) {
		this.proprietes.add(propriete);
	}
	
	public void add(Methode methode) {
		this.methodes.add(methode);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Classe)) {
			return false;
		}
		Classe other = (Classe) obj;
		if (this.methodes == null) {
			if (other.methodes != null) {
				return false;
			}
		} else if (!this.methodes.equals(other.methodes)) {
			return false;
		}
		if (this.nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!this.nom.equals(other.nom)) {
			return false;
		}
		if (this.proprietes == null) {
			if (other.proprietes != null) {
				return false;
			}
		} else if (!this.proprietes.equals(other.proprietes)) {
			return false;
		}
		return true;
	}
	
	
}
