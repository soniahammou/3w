package Services;

import Interfaces.IMessagerie;
import Entities.Conversation;

import Entities.Heritage.AbstractPersonne;


public class ServiceMessagerie implements IMessagerie {

    @Override
    public static boolean envoyerMessage(String contenu, AbstractPersonne expediteur, AbstractPersonne destinataire) {
        return true;
    }

    @Override
    public static Conversation archiverConversation(Conversation conversation) {
        this.conversation.setStatut("archivé");

        return conversation;
    }

    @Override
    public static Conversation definirStatut(String statut, Conversation conversation) {
        this.conversation.setStatut(statut);

        return conversation;
    }
}