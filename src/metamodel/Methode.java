package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class Methode implements Visitable {

	private String nom;
	private List<Parametre> parametres;
	private String typeRetour;
	private String visibilite;
	
	public Methode() {
		this.parametres = new ArrayList<Parametre>();
	}
	
	public Methode(String nom, String typeRetour, String visibilite) {
		this.nom = nom;
		this.parametres = new ArrayList<Parametre>();
		this.typeRetour = typeRetour;
		this.visibilite = visibilite;
	}
	
	public List<Parametre> getParametres() {
		return parametres;
	}

	@Override
	public void accept(Visiteur visiteur) {
		visiteur.visitMethode(this);
	}
	
	public void add(Parametre parametre) {
		this.parametres.add(parametre);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTypeRetour() {
		return typeRetour;
	}
	public void setTypeRetour(String typeRetour) {
		this.typeRetour = typeRetour;
	}
	public String getVisibilite() {
		return visibilite;
	}
	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Methode)) {
			return false;
		}
		Methode other = (Methode) obj;
		if (this.nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!this.nom.equals(other.nom)) {
			return false;
		}
		if (this.parametres == null) {
			if (other.parametres != null) {
				return false;
			}
		} else if (!this.parametres.equals(other.parametres)) {
			return false;
		}
		if (this.typeRetour == null) {
			if (other.typeRetour != null) {
				return false;
			}
		} else if (!this.typeRetour.equals(other.typeRetour)) {
			return false;
		}
		if (this.visibilite == null) {
			if (other.visibilite != null) {
				return false;
			}
		} else if (!this.visibilite.equals(other.visibilite)) {
			return false;
		}
		return true;
	}
	
	
}
