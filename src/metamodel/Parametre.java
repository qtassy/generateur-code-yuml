package metamodel;

import generateur.Visitable;
import generateur.Visiteur;

public class Parametre implements Visitable {

	private String nom;
	private String type;
		
	public Parametre() {}
	
	public Parametre(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}
	@Override
	public void accept(Visiteur visiteur) {
		visiteur.visitParametre(this);
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Parametre)) {
			return false;
		}
		Parametre other = (Parametre) obj;
		if (this.nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!this.nom.equals(other.nom)) {
			return false;
		}
		if (this.type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!this.type.equals(other.type)) {
			return false;
		}
		return true;
	}
	
	
	
}
