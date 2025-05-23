package Entities;

import java.util.List;
import Entities.Heritage.AbstractRendezVous;
import Entities.Heritage.AbstractPersonne;
import java.time.LocalDateTime;

public class RendezVousTel extends AbstractRendezVous {

 private String telephone;

  public RendezVousTel(List<AbstractPersonne> participants, LocalDateTime date, String telephone) {
    super(participants, date);
    this.telephone = telephone;
  }

  @Override
  public String toString() {
    return "RDV téléphonique, le numéro a appelé est le " + this.telephone + ", le rendez-vous aura lieu le " + this.date.toString();
  }


  public String getTelephone(){
    return this.telephone;
  }


  public void setTelephone(String telephone){
    this.telephone = telephone;
  }
}
