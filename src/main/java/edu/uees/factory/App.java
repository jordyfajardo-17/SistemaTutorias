package edu.uees.factory;

public class App {

    public static void main(String[] args) {
        NotificadorCreator emailCreator = new EmailCreator();
        Notificador email = emailCreator.crearNotificador();
        email.enviar("estudiante@uees.edu.ec", "Su tutoría ha sido confirmada.");

        NotificadorCreator pushCreator = new PushCreator();
        Notificador push = pushCreator.crearNotificador();
        push.enviar("estudiante-123", "Tiene una nueva notificación de tutoría.");

        NotificadorCreator smsCreator = new SmsCreator();
        Notificador sms = smsCreator.crearNotificador();
        sms.enviar("0999999999", "Recordatorio: su tutoría es mañana.");
    }
}
