package Interfaces;

import Entities.Alternant;
import Entities.Recruteur;
import Entities.Heritage.AbstractRendezVous;
import java.time.LocalDateTime;
import java.util.Scanner;

public interface IRendezvous {
    
    public AbstractRendezVous proposerRDV(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV, Scanner scanner);

    public AbstractRendezVous repondrePropositionRDV(AbstractRendezVous rendezVous, String statut);

    public boolean enregistrerRdv(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV);

    public boolean annulerRdv(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV);
}