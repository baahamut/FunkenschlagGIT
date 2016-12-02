package Model.MarcheCentrales;

import java.util.ArrayList;
import java.util.List;
import Model.MarcheRessources.Marqueur;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("247a81dc-aeb6-4dbe-a515-7ee56d150730")
public class Centrale extends Carte {
    @objid("f03f4719-38e3-40e8-988e-b3fae92e6afc")
    private int valeur;

    @objid("c18ffb3e-4412-431c-bd45-f134e62bc4d4")
    private String type;

    @objid("a595894a-8706-44eb-a538-fddd909952f4")
    private int alimente;

    @objid("28184114-8fcc-4038-b0fb-49637043e803")
    private boolean chargee;

    @objid("081ce1ae-4cc4-49c8-889e-afb6c4930289")
    private int capacite;

    private int capaciteSurcharge;

    private boolean surchargee;

    @objid("3caa0128-bea9-4828-9a91-5838b018f263")
    public ArrayList<Marqueur> Marqueurs = new ArrayList<Marqueur>();

    public Centrale(int valeur, String type, int alimente, boolean chargee, int capacite, boolean surchargee,
            int capaciteSurcharge) {
        super();
        this.valeur = valeur;
        this.type = type;
        this.alimente = alimente;
        this.chargee = chargee;
        this.capacite = capacite;
        this.surchargee = surchargee;
        this.capaciteSurcharge = capacite * 2;
        Marqueurs = new ArrayList<Marqueur>();
    }

    @objid("860a7f83-85b1-4cd8-8ee7-4971d7e05133")
    public void ajouterRessources(Marqueur m) {
        if (this.capacite < Marqueurs.size()) {
            Marqueurs.add(m);
        } else if (this.capacite == Marqueurs.size() && Marqueurs.size() < capaciteSurcharge) {
            chargee=true;
            System.out.println("Votre central est chargée, vous ajoutez pour la surcharge !");
            Marqueurs.add(m);
        }else {
            surchargee=true;
            System.out.println("Votre central est surchargée, vous ne pouvez pas ajouter plus de ressource !");
        }
    }

    @objid("68f49f02-383c-42ed-a70b-cb267e946703")
    public void retirerRessources(Marqueur m) {
        Marqueurs.remove(m);
    }

}