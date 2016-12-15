package Model.MarcheCentrales;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f6622d30-f868-4c3b-b966-2014991a7094")
public class Etape extends Carte {
    @objid ("120f36a1-a1ce-4692-8ed3-64c0722b7a2c")
    private String nom;

	public Etape(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
    
}
