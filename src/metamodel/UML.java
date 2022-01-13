package metamodel;

import java.util.ArrayList;
import java.util.List;

import generateur.Visitable;
import generateur.Visiteur;

public class UML implements Visitable {

	private List<UnPackage> packages;
	
	public UML() {
		this.packages = new ArrayList<UnPackage>();
	}

	public List<UnPackage> getPackages() {
		return packages;
	}
	
	@Override
	public void accept(Visiteur visiteur) {		
		visiteur.visitUML(this);
	}
	
	public void add(UnPackage unPackage) {
		this.packages.add(unPackage);
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
		
		if (this.packages == null) {
			if (other.packages != null) {
				return false;
			}
		} else if (!this.packages.equals(other.packages)) {
			return false;
		}
		return true;
	}

	
}
