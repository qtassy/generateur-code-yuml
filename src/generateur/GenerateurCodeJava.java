package generateur;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import metamodel.Classe;
import metamodel.Methode;
import metamodel.Parametre;
import metamodel.Propriete;
import metamodel.UML;
import metamodel.UnPackage;

public class GenerateurCodeJava implements Visiteur {
	String cheminDossier;
	Map<String, String> code;
	Map<String, Map<String, String>> classesPackages;
	String codeClasse;
	
	public GenerateurCodeJava(String folderName) {
		this.cheminDossier = folderName;
		this.classesPackages = null;
	}

	@Override
	public void visitUML(UML uml) {
		this.classesPackages = new HashMap<String, Map<String, String>>();
		
		for(UnPackage unPackage : uml.getPackages()) {
			this.codeClasse = "package " + unPackage.getNom() + ";\n\n";
			unPackage.accept(this);
			this.classesPackages.put(unPackage.getNom(), this.code);
		}
	}
	
	@Override
	public void visitUnPackage(UnPackage unPackage) {
		for(Classe classe : unPackage.getClasses()) {
			this.code = new HashMap<String, String>();
			classe.accept(this);
			this.code.put(classe.getNom(), this.codeClasse);
		}
	}

	@Override
	public void visitClasse(Classe classe) {
		if(classe.getVisibilite() != null) {
			this.codeClasse += classe.getVisibilite() + " ";
		}
		
		this.codeClasse += "class " + classe.getNom() + "{\n";
		
		for(Propriete propriete : classe.getProprietes()) {
			propriete.accept(this);
		}
		
		for(Methode methode : classe.getMethodes()) {
			methode.accept(this);
		}
		
		this.codeClasse += "\n}\n";
	}
	
	@Override
	public void visitPropriete(Propriete propriete) {
		this.codeClasse += "\t" + propriete.getVisibilite();
		this.codeClasse += " " + propriete.getType();
		this.codeClasse += " " + propriete.getNom() + ";\n";
	}

	@Override
	public void visitMethode(Methode methode) {
		this.codeClasse += "\n\t" + methode.getVisibilite();
		this.codeClasse += " " + methode.getTypeRetour();
		this.codeClasse += " " + methode.getNom() + "(";
		
		List<Parametre> parametres = methode.getParametres();
		
		for(int i = 0; i < parametres.size(); i++) {
			parametres.get(i).accept(this);
			if(i < parametres.size() - 1) {
				this.codeClasse += ", ";
			}
		}
		
		this.codeClasse += ") {\n\t\t";
		this.codeClasse += "return null;\n\t}";
	}

	@Override
	public void visitParametre(Parametre parametre) {
		this.codeClasse += parametre.getType() + " ";
		this.codeClasse += parametre.getNom();
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	public void toJavaFiles() throws Exception {
		Path path = Paths.get(this.cheminDossier);
		try {
			if(!Files.exists(path)) {
				Files.createDirectory(path);
			}
		} catch (IOException ioe1) {
			// TODO Auto-generated catch block
			ioe1.printStackTrace();
		}
		
		for(Map.Entry<String, Map<String, String>> unPackage : this.classesPackages.entrySet()) {
			String cheminPackage = this.cheminDossier + "\\" + unPackage.getKey();
			Path pathPackage = Paths.get(cheminPackage);
			try {
				if(!Files.exists(pathPackage)) {
					Files.createDirectory(pathPackage);
				}
			} catch (IOException ioe2) {
				// TODO Auto-generated catch block
				ioe2.printStackTrace();
			}
			
			for (Map.Entry<String, String> classe : unPackage.getValue().entrySet()) {
				File file = new File(cheminPackage + "\\" + classe.getKey() + ".java");
				try {
					OutputStream stream = new FileOutputStream(file);
					stream.write(classe.getValue().getBytes());
					stream.close();
				} catch (FileNotFoundException fnfe) {
					// TODO Auto-generated catch block
					fnfe.printStackTrace();
				} catch (IOException ioe3) {
					ioe3.printStackTrace();
				}
		    }
		}
	}
}
