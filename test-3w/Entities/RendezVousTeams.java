package Entities;

import java.time.LocalDateTime;
import java.util.List;
import Entities.Heritage.AbstractRendezVous;
import Entities.Heritage.AbstractPersonne;

public class RendezVousTeams extends AbstractRendezVous {
    
    protected String lienTeams;

    public RendezVousTeams(List<AbstractPersonne> participants, LocalDateTime date, String lienTeams) {
        super(participants, date);
        this.lienTeams = lienTeams;
    }


  @Override
  public String toString() {
    return "RDV Teams, le lien Teams a appelé est le " + this.lienTeams + ", le rendez-vous aura lieu le " + this.date.toString();
  }



    public String getLienTeams() {
        return this.lienTeams;
    }

    public void setLienTeams(String lienTeams) {
        this.lienTeams = lienTeams;
    }
}