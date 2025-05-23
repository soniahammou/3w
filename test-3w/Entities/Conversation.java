package Entities;

import java.util.List;
import java.util.ArrayList;
import Entities.Message;


public class Conversation {
    
    private String statut;

    private List<Message> listMessages = new ArrayList<>();

    public String getStatut(){
      return this.statut;
    }

    public void setStatut(String statut){
      this.statut = statut;
    }

    public List<Message> getListMessages() {
        return this.listMessages;
    }

    public void addMessage(Message message) {
        this.listMessages.add(message);
    }

    public void removeMessage(Message message) {
        if (this.listMessages.contains(message)) {
            this.listMessages.remove(message);
        }
    }
}