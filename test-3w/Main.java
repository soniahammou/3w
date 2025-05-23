import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import Entities.Recruteur;
import Entities.Alternant;
import Entities.Conversation;
import Entities.Heritage.AbstractPersonne;
import Entities.Message;
import Entities.RendezVousPresentiel;
import Entities.RendezVousTel;
import Entities.RendezVousTeams;
import Entities.Heritage.AbstractRendezVous;
import Services.ServiceNotification;
import Services.ServiceRendezvous;
import java.util.Scanner;

class Main {
    public static void main(String[] args){

        System.out.println("Bonjour et bienvenue sur le système de mise en relation entre les entreprises et les alternants ! \n");

        System.out.println("Souhaitez vous proposer un RDV à un alternant [1] ou bien répondre à une proposition d'alternance de la part d'une entreprise [2] ? \n");

        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();

        Main main = new Main();

        switch (response) {
            case "1":
                main.proposerRDV(scanner);
                break;
            case "2":
                main.repondrePropositionRDV(scanner, main);
                break;
            default:
                main.proposerRDV(scanner);
        }
    }

    private void proposerRDV(Scanner scanner) {
        System.out.println("pouvez vous nous donner votre email : \n");
        String recruteurEmail = scanner.nextLine();

        Recruteur recruteur = new Recruteur(recruteurEmail, recruteurEmail, "06 06 09 08 07", "PDG", "RECRUTEUR SARL");

        Alternant alternant = new Alternant("Bob", "bob@3wa.fr", "08 06 90 04 07", "Paris", "Immediate");

        System.out.println("Quelle type de rendez-vous souhaitez vous avoir ?");
        System.out.println("RDV Présentiel [1]");
        System.out.println("RDV Teams [2]");
        System.out.println("RDV Téléphone [3] \2");

        String rdvType = scanner.nextLine();

        ServiceRendezvous serviceRendezvous = new ServiceRendezvous();
        AbstractRendezVous rendezVous = serviceRendezvous.proposerRDV(alternant, recruteur, LocalDateTime.now(), rdvType, scanner);

        System.out.println(" Il s'agit d'un rdv \n" + rendezVous.toString());


        System.out.println("La proposition de rdv a bien été envoyé\n");

        


// javac *.java
// java Main
    }

    private void repondrePropositionRDV(Scanner scanner, Main main) {
        System.out.println("Vous souhaitez donc répondre à une proposition de RDV, pouvez vous donner votre nom :");

        String alternantName = scanner.nextLine();

        Alternant alternant = new Alternant(alternantName, alternantName + "@gmail.com", "06 06 09 08 07", "Paris", "Immediate");

        System.out.println("Avec qui ce rendez-vous est-il prévu ? \n");

        String recruteurName = scanner.nextLine();

        Recruteur recruteur = new Recruteur(recruteurName, recruteurName + "@gmail.com", "06 06 06 06 06", "PDG", recruteurName + " SARL");


        System.out.println("C'est donc avec " + recruteurName + ". Quelle type de proposition avez vous reçue ?");
        System.out.println("RDV Présentiel [1]");
        System.out.println("RDV Teams [2]");
        System.out.println("RDV Téléphone [3] \2");

        String rdvType = scanner.nextLine();

        AbstractRendezVous rendezvous;

        List<AbstractPersonne> participants = Arrays.asList(recruteur, alternant);
        
        switch (rdvType) {
            case "1":
                rendezvous = new RendezVousPresentiel(participants, LocalDateTime.now(), "1 rue de la république, Paris");
                break;
            case "2":
                rendezvous = new RendezVousTeams(participants, LocalDateTime.now(), "https://teams.com/zef4ze8f49");
                break;
            case "3":
                rendezvous = new RendezVousTel(participants, LocalDateTime.now(), "06 05 80 07 04");
                break;
            default:
                rendezvous = new RendezVousPresentiel(participants, LocalDateTime.now(), "1 rue de la république, Paris");
        }

        System.out.println("Et enfin, acceptez vous la proposition de rendez-vous ?");
        System.out.println("Oui [1]");
        System.out.println("Non [2]");

        String reponseProposition = scanner.nextLine();

        ServiceRendezvous serviceRendezvous = new ServiceRendezvous();

        String reponsePropositionFormatte;

        if (reponseProposition == "2") {
            reponsePropositionFormatte = "refusé";
        } else {
            reponsePropositionFormatte = "accepté";
        }
        
        rendezvous = serviceRendezvous.repondrePropositionRDV(rendezvous, reponsePropositionFormatte);
        
        System.out.println("Le " + rendezvous.toString() + ". Ce rendez-vous a bien été " + reponsePropositionFormatte + ".");
    }
}