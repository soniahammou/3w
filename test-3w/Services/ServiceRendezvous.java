package Services;

import Interfaces.IRendezvous;
import Entities.Alternant;
import Entities.Recruteur;
import Entities.Heritage.AbstractRendezVous;
import Entities.RendezVousTeams;
import Entities.RendezVousPresentiel;
import Entities.RendezVousTel;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class ServiceRendezvous implements IRendezvous {

    public AbstractRendezVous proposerRDV(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV, Scanner scanner) {
            
        switch (typeRDV) {
            case "presentiel":
                System.out.println("Quelle sera l'adresse du rdv ?");

                String adresse = scanner.nextLine();
                return new RendezVousPresentiel(Arrays.asList(recruteur, alternant), dateTime, adresse);            
            case "teams" :
                System.out.println("Renseigner le lien de la réunion teams");
                String lienTeams = scanner.nextLine();
                return new RendezVousTeams(Arrays.asList(recruteur, alternant), dateTime, lienTeams);
     
            case "telephonique" :
                System.out.println("Renseigner le numéro de téléphone pour l'appel téléphonique");

                String telephone = scanner.nextLine();
                return new RendezVousTel(Arrays.asList(recruteur, alternant), dateTime, telephone);
            default:
                System.out.println("Quelle sera l'adresse du rdv ?");

                String adresseRDV = scanner.nextLine();
                return new RendezVousPresentiel(Arrays.asList(recruteur, alternant), dateTime, adresseRDV);
        }
    }

    public AbstractRendezVous repondrePropositionRDV(AbstractRendezVous rendezVous, String statut) {
     
       rendezVous.setStatut(statut);


        return rendezVous;
    }

    public boolean enregistrerRdv(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV) {
        return true;
    }

    public boolean annulerRdv(Alternant alternant, Recruteur recruteur, LocalDateTime dateTime, String typeRDV) {
        return true;
    }
}