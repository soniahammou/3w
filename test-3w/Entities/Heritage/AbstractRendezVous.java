package Entities.Heritage;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractRendezVous{
    protected List<AbstractPersonne> participants = new ArrayList<>();

    protected LocalDateTime date;

    protected String statut;

    public AbstractRendezVous(List<AbstractPersonne> participants, LocalDateTime date) {
        this.participants = participants;
        this.date = date;
    }

    public List<AbstractPersonne> getParticipants() {
        return this.participants;
    }

    public void addParticipant(AbstractPersonne participant) {
        this.participants.add(participant);
    }

    public void removeParticipant(AbstractPersonne participant) {
        if (this.participants.contains(participant)) {
            this.participants.remove(participant);
        }
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    } 

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}