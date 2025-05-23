package Entities;

import Entities.Heritage.AbstractPersonne;

public class Recruteur extends AbstractPersonne {

    private String poste;

    private String entreprise;

    public Recruteur(String nom, String email, String telephone, String poste, String entreprise) {
        super(nom, email, telephone);
        this.poste = poste;
        this.entreprise = entreprise;
    }

    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEntreprise() {
        return this.entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}   