package edu.uees.factory;

public class App {

    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("SISTEMA DE NOTIFICACIONES - PATRÓN FACTORY METHOD");
        System.out.println("=".repeat(70) + "\n");

        // Notificador 1: Email
        System.out.println("[1] Creando notificador de EMAIL...");
        NotificadorCreator emailCreator = new EmailCreator();
        System.out.println("    ✓ Creator: " + emailCreator.getClass().getSimpleName());
        Notificador email = emailCreator.crearNotificador();
        System.out.println("    ✓ Producto: " + email.getClass().getSimpleName());
        System.out.println("    ✓ Enviando mensaje...");
        email.enviar("estudiante@uees.edu.ec", "Su tutoría ha sido confirmada.");
        System.out.println();

        // Notificador 2: Push
        System.out.println("[2] Creando notificador de PUSH...");
        NotificadorCreator pushCreator = new PushCreator();
        System.out.println("    ✓ Creator: " + pushCreator.getClass().getSimpleName());
        Notificador push = pushCreator.crearNotificador();
        System.out.println("    ✓ Producto: " + push.getClass().getSimpleName());
        System.out.println("    ✓ Enviando mensaje...");
        push.enviar("estudiante-123", "Tiene una nueva notificación de tutoría.");
        System.out.println();

        // Notificador 3: SMS
        System.out.println("[3] Creando notificador de SMS...");
        NotificadorCreator smsCreator = new SmsCreator();
        System.out.println("    ✓ Creator: " + smsCreator.getClass().getSimpleName());
        Notificador sms = smsCreator.crearNotificador();
        System.out.println("    ✓ Producto: " + sms.getClass().getSimpleName());
        System.out.println("    ✓ Enviando mensaje...");
        sms.enviar("0999999999", "Recordatorio: su tutoría es mañana.");
        System.out.println();

        System.out.println("=".repeat(70));
        System.out.println("✓ PROCESO COMPLETADO EXITOSAMENTE");
        System.out.println("=".repeat(70) + "\n");
    }
}
