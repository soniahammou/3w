package Interfaces;

import Entities.Conversation;

public interface IMessagerie {
    public static boolean envoyerMessage(String contenu, String expediteur, String destinataire);

    public static Conversation archiverConversation(Conversation conversation);

    public static Conversation definirStatut(String statut, Conversation conversation);
}