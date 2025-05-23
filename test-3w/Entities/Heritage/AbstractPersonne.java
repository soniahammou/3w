package Entities.Heritage;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractPersonne {
    
    protected String nom;

    protected String email;

    protected String telephone;
    
    protected List<AbstractRendezVous> rendezVous = new ArrayList<>();

    public AbstractPersonne(String nom, String email, String telephone) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<AbstractRendezVous> getRendezVous() {
        return this.rendezVous;
    }

    public void addRendezVous(AbstractRendezVous rendezVous) {
        this.rendezVous.add(rendezVous);
    }

    public void removeRendezVous(AbstractRendezVous rendezVous) {
        if (this.rendezVous.contains(rendezVous)) {
            this.rendezVous.remove(rendezVous);
        }
    }
}