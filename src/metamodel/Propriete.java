package metamodel;

import generateur.Visitable;
import generateur.Visiteur;

public class Propriete implements Visitable {

	private String type;
	private String nom;
	private String visibilite;	
	
	public Propriete() {}
	
	public Propriete(String type, String nom, String visibilite) {
		this.type = type;
		this.nom = nom;
		this.visibilite = visibilite;
	}
	@Override
	public void accept(Visiteur visiteur) {
		visiteur.visitPropriete(this);		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
		if (!(obj instanceof Propriete)) {
			return false;
		}
		Propriete other = (Propriete) obj;
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
