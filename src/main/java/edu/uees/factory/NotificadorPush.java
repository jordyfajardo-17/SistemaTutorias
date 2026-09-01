package edu.uees.factory;

public class NotificadorPush implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("    🔔 TIPO: Push Notification");
        System.out.println("    👤 USUARIO: " + destino);
        System.out.println("    💬 MENSAJE: " + mensaje);
        System.out.println("    ✅ ESTADO: Notificación enviada");
    }
}
