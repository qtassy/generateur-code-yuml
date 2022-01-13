package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class UML implements Visitable {

	private List<Classe> classes;
	
	public UML() {
		this.classes = new ArrayList<Classe>();
	}

	@Override
	public void accept(Visiteur visiteur) {		
		visiteur.visitUML(this);
	}
	
	public void add(Classe classe) {
		this.classes.add(classe);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UML)) {
			return false;
		}
		
		UML other = (UML) obj;
		
		if (this.classes == null) {
			if (other.classes != null) {
				return false;
			}
		} else if (!this.classes.equals(other.classes)) {
			return false;
		}
		return true;
	}

	
}
