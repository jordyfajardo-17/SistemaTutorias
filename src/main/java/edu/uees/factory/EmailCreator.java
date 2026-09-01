package edu.uees.factory;

public class EmailCreator extends NotificadorCreator {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorEmail();
    }
}
