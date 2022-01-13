package generateur;

import metamodel.Classe;
import metamodel.Methode;
import metamodel.Parametre;
import metamodel.Propriete;
import metamodel.UML;

public interface Visiteur {

	public void visitUML(UML uml);
	public void visitClasse(Classe classe);
	public void visitMethode(Methode methode);
	public void visitPropriete(Propriete propriete);
	public void visitParametre(Parametre parametre);
	
}
