package Entities;

public class Competence {
    private String intitule;

    private String niveau;

    public Competence(String intitule, String niveau) {
        this.intitule = intitule;
        this.niveau = niveau;
    }

    public String getIntitule() {
        return this.intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}