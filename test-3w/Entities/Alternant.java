package Entities;

import Entities.Heritage.AbstractPersonne;
import Entities.Competence;


import java.util.List;
import java.util.ArrayList;


public class Alternant extends AbstractPersonne {

    private String localisation;

    private String disponibilite;

    private List<Competence> competences;

    public Alternant(String nom, String email, String telephone, String localisation, String disponibilite) {
        super(nom, email, telephone);
        this.localisation = localisation;
        this.disponibilite = disponibilite;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDisponibilite() {
        return this.disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public List<Competence> getCompetences() {
        return this.competences;
    }

    public void addCompetence(Competence competence) {
        this.competences.add(competence);
    }

    public void removeCompetence(Competence competence) {
        if (this.competences.contains(competence)) {
            this.competences.remove(competence);
        }
    }
}