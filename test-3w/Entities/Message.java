package Entities;

import java.time.LocalDateTime;
import Entities.Heritage.AbstractPersonne;

public class Message {

    private String contenu;
    private LocalDateTime date;
    private AbstractPersonne destinataire;
    private AbstractPersonne expediteur;


    public Message(String contenu, LocalDateTime date, AbstractPersonne destinataire, AbstractPersonne expediteur) {
      this.contenu = contenu;
      this.date = date;
      this.destinataire = destinataire;
      this.expediteur = expediteur;
    }

//contenu
    public String getContenu(){
      return this.contenu;
    }

    public void setContenu(String contenu){
      this.contenu = contenu;
    }


// date
    public LocalDateTime getDate(){
      return this.date;
    }

    public void setDate(LocalDateTime date){
      this.date = date;
    }


// destinataire 
  public AbstractPersonne getdDestinataire(){
      return this.destinataire;
    }

    public void setdDestinataire (AbstractPersonne destinataire){
      this.destinataire = destinataire;
    }


// expediteur 
  public AbstractPersonne getExpediteur(){
      return this.expediteur;
    }

    public void SetExpediteur (AbstractPersonne expediteur){
      this.expediteur = expediteur;
    }


}