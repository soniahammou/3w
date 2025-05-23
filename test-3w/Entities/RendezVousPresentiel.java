package Entities;

import java.time.LocalDateTime;
import java.util.List;
import Entities.Heritage.AbstractRendezVous;
import Entities.Heritage.AbstractPersonne;


public class RendezVousPresentiel extends AbstractRendezVous {
    
    protected String adresse;

    public RendezVousPresentiel(List<AbstractPersonne> participants, LocalDateTime date, String adresse) {
        super(participants, date);
        this.adresse = adresse;
    }

     @Override
  public String toString() {
    return "RDV en présentiel, l'adresse du rdv est la suivante :  " + this.adresse + ", le rendez-vous aura lieu le " + this.date.toString();
  }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}