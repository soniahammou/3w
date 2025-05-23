package Interfaces;

import Entities.Heritage.AbstractPersonne;

public interface INotifications {
    public void envoyerNotification(String contenu, AbstractPersonne destinataire);
}