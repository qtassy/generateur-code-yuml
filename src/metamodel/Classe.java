package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class Classe implements Visitable {

	private String visibilite;	
	private String nom;
	private String nomPackage;
	private List<Propriete> proprietes;
	private List<Methode> methodes;

	public Classe() {
		this.proprietes = new ArrayList<Propriete>();
		this.methodes = new ArrayList<Methode>();
	}
	
	public List<Propriete> getProprietes() {
		return proprietes;
	}
	
	public List<Methode> getMethodes() {
		return methodes;
	}

	public Classe(String nom) {
		this.nom = nom;
		this.proprietes = new ArrayList<Propriete>();
		this.methodes = new ArrayList<Methode>();
	}

	public String getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomPackage() {
		return nomPackage;
	}

	public void setNomPackage(String nomPackage) {
		this.nomPackage = nomPackage;
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
		if (this.visibilite == null) {
			if (other.visibilite != null) {
				return false;
			}
		} else if (!this.visibilite.equals(other.visibilite)) {
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
