package edu.uees.factory;

public class SmsCreator extends NotificadorCreator {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorSms();
    }
}
