package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class UnPackage implements Visitable {
	private String nom;
	private List<Classe> classes;	

	public UnPackage() {
		classes = new ArrayList<Classe>();
	}
	
	public void add(Classe classe) {
		this.classes.add(classe);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UnPackage)) {
			return false;
		}
		UnPackage other = (UnPackage) obj;
		if (classes == null) {
			if (other.classes != null) {
				return false;
			}
		} else if (!classes.equals(other.classes)) {
			return false;
		}
		if (nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!nom.equals(other.nom)) {
			return false;
		}
		return true;
	}

	@Override
	public void accept(Visiteur visiteur) {
		visiteur.visitUnPackage(this);
	}
	
	
}
