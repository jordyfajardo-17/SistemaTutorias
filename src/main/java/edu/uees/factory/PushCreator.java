package edu.uees.factory;

public class PushCreator extends NotificadorCreator {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorPush();
    }
}
